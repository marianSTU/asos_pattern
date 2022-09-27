package org.example;

import org.example.DAO.DataSource;

import java.io.*;
import java.lang.reflect.Constructor;

public class Main {
	public static void main(String[] args) {
		DataSource instanceOne = DataSource.getInstance();
		DataSource instanceTwo = (DataSource) instanceOne.clone();
		System.out.println("hashCode of instance 1 - " + instanceOne.hashCode());
		System.out.println("hashCode of instance 2 - " + instanceTwo.hashCode());
	}
}
