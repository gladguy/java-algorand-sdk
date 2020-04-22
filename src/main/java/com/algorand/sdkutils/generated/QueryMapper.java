package com.algorand.sdkutils.generated;

import java.text.SimpleDateFormat;

import java.text.ParseException;
import com.algorand.algosdk.v2.client.indexer.*;
import com.algorand.algosdk.crypto.Address;
import java.security.NoSuchAlgorithmException;
import com.algorand.algosdk.v2.client.common.Client;
import com.algorand.algosdk.v2.client.common.Query;

public class QueryMapper {

	public static Query getClass(String name, Client client, String args[]) {
		switch (name) {
		case "searchForAccounts":
			return client.searchForAccounts();
		case "lookupAccountByID":
			return client.lookupAccountByID(args[0]);
		case "lookupAccountTransactions":
			return client.lookupAccountTransactions(args[0]);
		case "searchForAssets":
			return client.searchForAssets();
		case "lookupAssetByID":
			return client.lookupAssetByID(Long.valueOf(args[0]));
		case "lookupAssetBalances":
			return client.lookupAssetBalances(Long.valueOf(args[0]));
		case "lookupAssetTransactions":
			return client.lookupAssetTransactions(Long.valueOf(args[0]));
		case "lookupBlock":
			return client.lookupBlock(Long.valueOf(args[0]));
		case "searchForTransactions":
			return client.searchForTransactions();
		}
		return null;
	}

	public static void setValue(Query q, String className, String property, String value) throws ParseException, NoSuchAlgorithmException {
		switch (className) {
		case "searchForAccounts":
			switch (property) {
			case "asset-id":
				((SearchForAccounts)q).assetId(Long.valueOf(value));
				break;
			case "currency-greater-than":
				((SearchForAccounts)q).currencyGreaterThan(Long.valueOf(value));
				break;
			case "currency-less-than":
				((SearchForAccounts)q).currencyLessThan(Long.valueOf(value));
				break;
			case "limit":
				((SearchForAccounts)q).limit(Long.valueOf(value));
				break;
			case "next":
				((SearchForAccounts)q).next(value);
				break;
			case "round":
				((SearchForAccounts)q).round(Long.valueOf(value));
				break;
			}
			break;
		case "lookupAccountByID":
			switch (property) {
			case "round":
				((LookupAccountByID)q).round(Long.valueOf(value));
				break;
			}
			break;
		case "lookupAccountTransactions":
			switch (property) {
			case "after-time":
				((LookupAccountTransactions)q).afterTime(new SimpleDateFormat("yyyy-MM-dd'T'h:m:ssZ").parse(value));
				break;
			case "asset-id":
				((LookupAccountTransactions)q).assetId(Long.valueOf(value));
				break;
			case "before-time":
				((LookupAccountTransactions)q).beforeTime(new SimpleDateFormat("yyyy-MM-dd'T'h:m:ssZ").parse(value));
				break;
			case "currency-greater-than":
				((LookupAccountTransactions)q).currencyGreaterThan(Long.valueOf(value));
				break;
			case "currency-less-than":
				((LookupAccountTransactions)q).currencyLessThan(Long.valueOf(value));
				break;
			case "limit":
				((LookupAccountTransactions)q).limit(Long.valueOf(value));
				break;
			case "max-round":
				((LookupAccountTransactions)q).maxRound(Long.valueOf(value));
				break;
			case "min-round":
				((LookupAccountTransactions)q).minRound(Long.valueOf(value));
				break;
			case "next":
				((LookupAccountTransactions)q).next(value);
				break;
			case "note-prefix":
				((LookupAccountTransactions)q).notePrefix(value);
				break;
			case "round":
				((LookupAccountTransactions)q).round(Long.valueOf(value));
				break;
			case "sig-type":
				((LookupAccountTransactions)q).sigType(value);
				break;
			case "tx-id":
				((LookupAccountTransactions)q).txId(new Address(value));
				break;
			case "tx-type":
				((LookupAccountTransactions)q).txType(value);
				break;
			}
			break;
		case "searchForAssets":
			switch (property) {
			case "asset-id":
				((SearchForAssets)q).assetId(Long.valueOf(value));
				break;
			case "creator":
				((SearchForAssets)q).creator(value);
				break;
			case "limit":
				((SearchForAssets)q).limit(Long.valueOf(value));
				break;
			case "name":
				((SearchForAssets)q).name(value);
				break;
			case "next":
				((SearchForAssets)q).next(value);
				break;
			case "unit":
				((SearchForAssets)q).unit(value);
				break;
			}
			break;
		case "lookupAssetByID":
			switch (property) {
			}
			break;
		case "lookupAssetBalances":
			switch (property) {
			case "currency-greater-than":
				((LookupAssetBalances)q).currencyGreaterThan(Long.valueOf(value));
				break;
			case "currency-less-than":
				((LookupAssetBalances)q).currencyLessThan(Long.valueOf(value));
				break;
			case "limit":
				((LookupAssetBalances)q).limit(Long.valueOf(value));
				break;
			case "next":
				((LookupAssetBalances)q).next(value);
				break;
			case "round":
				((LookupAssetBalances)q).round(Long.valueOf(value));
				break;
			}
			break;
		case "lookupAssetTransactions":
			switch (property) {
			case "address":
				((LookupAssetTransactions)q).address(new SimpleDateFormat("yyyy-MM-dd'T'h:m:ssZ").parse(value));
				break;
			case "address-role":
				((LookupAssetTransactions)q).addressRole(value);
				break;
			case "after-time":
				((LookupAssetTransactions)q).afterTime(new SimpleDateFormat("yyyy-MM-dd'T'h:m:ssZ").parse(value));
				break;
			case "before-time":
				((LookupAssetTransactions)q).beforeTime(new SimpleDateFormat("yyyy-MM-dd'T'h:m:ssZ").parse(value));
				break;
			case "currency-greater-than":
				((LookupAssetTransactions)q).currencyGreaterThan(Long.valueOf(value));
				break;
			case "currency-less-than":
				((LookupAssetTransactions)q).currencyLessThan(Long.valueOf(value));
				break;
			case "exclude-close-to":
				((LookupAssetTransactions)q).excludeCloseTo(Boolean.valueOf(value));
				break;
			case "limit":
				((LookupAssetTransactions)q).limit(Long.valueOf(value));
				break;
			case "max-round":
				((LookupAssetTransactions)q).maxRound(Long.valueOf(value));
				break;
			case "min-round":
				((LookupAssetTransactions)q).minRound(Long.valueOf(value));
				break;
			case "next":
				((LookupAssetTransactions)q).next(value);
				break;
			case "note-prefix":
				((LookupAssetTransactions)q).notePrefix(value);
				break;
			case "round":
				((LookupAssetTransactions)q).round(Long.valueOf(value));
				break;
			case "sig-type":
				((LookupAssetTransactions)q).sigType(value);
				break;
			case "tx-id":
				((LookupAssetTransactions)q).txId(new Address(value));
				break;
			case "tx-type":
				((LookupAssetTransactions)q).txType(value);
				break;
			}
			break;
		case "lookupBlock":
			switch (property) {
			}
			break;
		case "searchForTransactions":
			switch (property) {
			case "address":
				((SearchForTransactions)q).address(new SimpleDateFormat("yyyy-MM-dd'T'h:m:ssZ").parse(value));
				break;
			case "address-role":
				((SearchForTransactions)q).addressRole(value);
				break;
			case "after-time":
				((SearchForTransactions)q).afterTime(new SimpleDateFormat("yyyy-MM-dd'T'h:m:ssZ").parse(value));
				break;
			case "asset-id":
				((SearchForTransactions)q).assetId(Long.valueOf(value));
				break;
			case "before-time":
				((SearchForTransactions)q).beforeTime(new SimpleDateFormat("yyyy-MM-dd'T'h:m:ssZ").parse(value));
				break;
			case "currency-greater-than":
				((SearchForTransactions)q).currencyGreaterThan(Long.valueOf(value));
				break;
			case "currency-less-than":
				((SearchForTransactions)q).currencyLessThan(Long.valueOf(value));
				break;
			case "exclude-close-to":
				((SearchForTransactions)q).excludeCloseTo(Boolean.valueOf(value));
				break;
			case "limit":
				((SearchForTransactions)q).limit(Long.valueOf(value));
				break;
			case "max-round":
				((SearchForTransactions)q).maxRound(Long.valueOf(value));
				break;
			case "min-round":
				((SearchForTransactions)q).minRound(Long.valueOf(value));
				break;
			case "next":
				((SearchForTransactions)q).next(value);
				break;
			case "note-prefix":
				((SearchForTransactions)q).notePrefix(value);
				break;
			case "round":
				((SearchForTransactions)q).round(Long.valueOf(value));
				break;
			case "sig-type":
				((SearchForTransactions)q).sigType(value);
				break;
			case "tx-id":
				((SearchForTransactions)q).txId(new Address(value));
				break;
			case "tx-type":
				((SearchForTransactions)q).txType(value);
				break;
			}
			break;

		}
	}

	public static String lookup(Query q, String className) throws Exception {
		switch (className) {
		case "searchForAccounts":
			return ((SearchForAccounts)q).execute().body().toString();
		case "lookupAccountByID":
			return ((LookupAccountByID)q).execute().body().toString();
		case "lookupAccountTransactions":
			return ((LookupAccountTransactions)q).execute().body().toString();
		case "searchForAssets":
			return ((SearchForAssets)q).execute().body().toString();
		case "lookupAssetByID":
			return ((LookupAssetByID)q).execute().body().toString();
		case "lookupAssetBalances":
			return ((LookupAssetBalances)q).execute().body().toString();
		case "lookupAssetTransactions":
			return ((LookupAssetTransactions)q).execute().body().toString();
		case "lookupBlock":
			return ((LookupBlock)q).execute().body().toString();
		case "searchForTransactions":
			return ((SearchForTransactions)q).execute().body().toString();
		}
		return null;
	}
}