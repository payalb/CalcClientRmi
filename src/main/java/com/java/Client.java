package com.java;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
	CalcContract obj=(CalcContract) Naming.lookup("rmi://localhost:1099/calcService");
	long result=obj.add(3, 4);
	System.out.println(result);
	}

}
