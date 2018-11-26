package com.java;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalcContract extends Remote{

	long add(int a, int b) throws RemoteException;

	long sub(int a, int b)  throws RemoteException;

	long mul(int a, int b)  throws RemoteException;

	long div(int a, int b)  throws RemoteException;

}