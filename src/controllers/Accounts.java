package controllers;

import controllers.exceptions.AccountExistsException;
import java.util.*;

public class Accounts {

    private HashMap<String, CustomAccount> accounts;
    private static int totalAccounts = 0;

    public Accounts() {
        accounts = new HashMap<>();
    }

    private String generateKey(Account a) {
        return a.getFullName().replace(' ', '\0').toLowerCase();
    }

    public void printAccounts() {
        accounts.values().forEach(a -> System.out.println(a.toString()));
    }

    public void addAccount(Account a) throws Exception {
        var keyAccount = generateKey(a);

        if (accounts.containsKey(keyAccount)) {
            throw new AccountExistsException("el usuario ya tiene asignada una cuenta a su nombre");
        }

        totalAccounts += 1;
        accounts.put(keyAccount, new CustomAccount(a));
    }

    public void deleteAccount(Account a) throws Exception {
        var keyAccount = generateKey(a);

        if (accounts.containsKey(keyAccount)) {
            throw new AccountExistsException("el usuario no tiene asignada una cuenta a su nombre");
        }

        accounts.remove(keyAccount);
    }

    public Collection<Account> searchAccount(String query) {
        ArrayList<Account> accountsFiltered = new ArrayList<>();
        var tmpQuery = query.toLowerCase();

        accounts.values().forEach(customAccount -> {
            var account = customAccount.account;
            if (account.getFullName().toLowerCase().contains(tmpQuery)) {
                accountsFiltered.add(account);
            }
        });

        return accountsFiltered;
    }

    public Account getById(int id) {
        ArrayList<CustomAccount> accountsFiltered = new ArrayList<>();

        accounts.values().forEach(a -> accountsFiltered.add(searchById(id, a)));

        return accountsFiltered.size() < 1 ? null : accountsFiltered.get(0).account;
    }

    public int getIdByFullName(String fullName) {
        ArrayList<CustomAccount> accountsFiltered = new ArrayList<>();

        accounts.values().forEach(a -> {
            if (a.account.getFullName().equals(fullName)) {
                accountsFiltered.add(a);
            }
        });

        return accountsFiltered.size() < 1 ? -1 : accountsFiltered.get(0).id;
    }

    private CustomAccount searchById(int id, CustomAccount account) {
        return account.id == id ? account : null;
    }

    private static class CustomAccount {

        private final Account account;
        private final int id;

        CustomAccount(Account a) {
            this.account = a;
            this.id = Accounts.totalAccounts;
        }

        @Override
        public String toString() {
            return "CustomAccount{"
                    + "account=" + account.toString()
                    + ", id=" + id
                    + '}';
        }
    }
}
