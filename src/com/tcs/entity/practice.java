package com.tcs.entity;

//public class practice {
//	 public static void main(String args[]) {
//		    for (int i = 0; i<5 ;i++) {
//		      switch(i) {
//		        case 0: System.out.print("v ");break;
//		        case 1: System.out.print("w ");
//		        case 2: System.out.print("x ");break;
//		        case 3: System.out.print("y ");
//		        case 4: System.out.print("z ");break;
//		        default: System.out.print("d ");
//		}}}}

// v w x x y z z 

//	public static void main(String args[]) {
//	    for (int i = 0; i < 5 ;i++) {
//	      switch(i) {
//	      case 0: System.out.print("v ");break;
//	      case 1: System.out.print("w ");
//	      case 2: System.out.print("x ");break;
//	      case 3: System.out.print("y ");
//	      case 4: System.out.print("z ");break;
//	}}}}
//
//v w x x y z z 
	
	
//	public static void main(String[] args) {
//	    boolean b = true;
//	    if (b = false) {System.out.print("A");
//	    } else if (b) {System.out.print("B");
//	    } else {System.out.print("C");}
//	}}
//
//C
	
	
//	static boolean b;
//	  public static void main(String[] args) {
//	    if (b) {System.out.print("A");
//	    } else if (b = false) {System.out.print("B");
//	    } else if (b) {System.out.print("C");
//	    } else if (!b) {System.out.print("D");
//	    } else {System.out.print("E");}
//	}}
//	
//	D
//	
	
	
//	public static void main(String[] args) {
//	    boolean b;
//	    if (b = false) {System.out.print("A");
//	    } else if (b) {System.out.print("B");
//	    } else if (!b) {System.out.print("C");
//	    } else {System.out.print("D");}
//	}}
//
//C
//	
	
//	public static void main (String[] args) {
//	    for (int i = 0; i < 4; i++) {
//	      switch (i) {
//	        case 0: System.out.print("A");
//	        case 1: System.out.print("B");
//	        case 2: System.out.print("C");
//	}}}}
//
//ABCBCC
	
//	public static void main (String args[]) {
//	    int i = 0, j = 0, k = 0;
//	label1:
//	    for (int h = 0; h < 6; h++) {
//	label2:
//	      do { i++; k = h + i + j;
//	        switch (k) {
//	          default: break label1;
//	          case 1: continue label2;
//	          case 2: break;
//	          case 3: break label2;
//	          case 4: continue label2;
//	          case 5: continue label1;
//	        }
//	      } while (++j<5);
//	    }
//	    System.out.println(h + "," + i + "," + j);
//	}}
//	ERROR
//	
	
//	public static void main(String args[]) {
//	    byte b = -1;
//	    switch(b) {
//	      case 0:    System.out.print("zero "); break;
//	      case 100:  System.out.print("100 ");  break;
//	      case 1000: System.out.print("1000 "); break;
//	      default: System.out.print("Default ");
//	}}}
	// ERROR
	
	
//	public static void main (String args[]) {
//	    char c = 'b';
//	    switch(c) {
//	      case 'a': System.out.print("1");
//	      case 'b': System.out.print("2");
//	      case 'c': System.out.print("3");
//	      default:  System.out.print("4");
//	}}}
//
//234
	
//	public static void main(String args[]) {
//	    int x = 6; int success = 0;
//	    do  {
//	      switch(x) {
//	        case 0: System.out.print("0"); x += 5; break;
//	        case 1: System.out.print("1"); x += 3; break;
//	        case 2: System.out.print("2"); x += 1; break;
//	        case 3: System.out.print("3"); success++; break;
//	        case 4: System.out.print("4"); x -= 1; break;
//	        case 5: System.out.print("5"); x -= 4; break;
//	        case 6: System.out.print("6"); x -= 5; break;
//	      }
//	    } while ((x != 3) || (success < 2));
//	}}
//
//61433
	
	
//	 public static void main(String args[]) {
//		    int x = -5; int success = 0;
//		    do  {
//		      switch(x) {
//		        case 0: System.out.print("0"); x += 5; break;
//		        case 1: System.out.print("1"); x += 3; break;
//		        case 2: System.out.print("2"); x += 1; break;
//		        case 3: System.out.print("3"); success++; break;
//		        case 4: System.out.print("4"); x -= 1; break;
//		        case 5: System.out.print("5"); x -= 4; break;
//		        case 6: System.out.print("6"); x -= 5; break;
//		        default: x += x < 0 ? 2 : -2;
//		      }
//		    } while ((x != 3) || (success < 2));
//		}}
//	
//1433
//	
	
	
//	 public static void main(String args[]) {
//		    int k;
//		    for (int i=0, j=0; i<2; i++,j++) {System.out.print(i);}     // 1
//		    for (int i=0, k=0; i<2; i++,k++) {System.out.print(i);}     // 2
//		    for (int i=0, int j=0; i<2; i++,j++) {System.out.print(i);} // 3
//		}}
//Error at line 3
	
	
//	static int i;
//	  public static void main(String args[]) {
//	    for (i=1; i<3; i++) {System.out.print(i);}     // 1
//	    for (int i=1; i<3; i++) {System.out.print(i);} // 2
//	    int i;                                         // 3
//	    for (i=0; i<2; i++) {System.out.print(i);}     // 4
//	    System.out.print(JMM125.i);
//	}}
//
//Error
	
//	static int i;
//	  public static void main(String args[]) {
//	    for (i=1; i<3; i++)     {System.out.print(i);} // 1
//	    for (int i=1; i<3; i++) {System.out.print(i);} // 2
//	    int i;                                         // 3
//	    for (int i=0; i<2; i++) {System.out.print(i);} // 4
//	    System.out.print(JMM126.i);
//	}}
//
//Error
	
	
//	 public static void main (String[] args) {
//		    int j = 0;
//		    do for (int i = 0; i++ < 2;)
//		      System.out.print(i);
//		    while (j++ < 2);
//		}}
//	
//121212
	
	
//	public static void main (String[] args) {
//	    int j = 0;
//	    for (int i = 0; i < 2; i++) do
//	      System.out.print(i);
//	    while (j++ < 2);
//	}}
//	
//0001
	
	
//	 public static void main (String[] args) {
//		    int j = 0;
//		    for (int i = 0; i++ < 2;) do
//		      System.out.print(i);
//		    while (j++ < 2);
//		}}
//1112
	
	
//	public static void main (String[] args) {
//	    int i = 0, j = 0, k = 0;
//	    do while (i++ < 3)
//	      System.out.print(k++);
//	    while (j++ < 3);
//	}}
//012	
//	
	
//	public static void main (String[] args) {
//	    int i = 0, j = 0;
//	    while (i++ < 3) do
//	      System.out.print(j);
//	    while (j++ < 3);
//	}}
//	
//012345
//	
	
//	static int m1(String s, int i) {
//	    System.out.print(s + i);
//	    return i;
//	  }
//	  public static void main (String[] args) {
//	    int i = 0, j = 0, k = 0;
//	    do while (m1("i", ++i) < 2)
//	      System.out.print("k" + ++k);
//	    while (m1("j", ++j) < 2);
//	}}
//	
//i1k1i2j1i3j2
	
	
	
	
	
	
	