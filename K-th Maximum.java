/**
 * Use this code for reference only.
 * 
 * @author Abhisek Singh (Zyroßeast)
 * 
 */

import java.io.DataInputStream;
import java.io.IOException;

public class Main {

   /**
    * Main logic for the program.
    * 
    * @param args Not Used anywhere
    * @throws IllegalArgumentException If any Error happens while processing data.
    * 
    */
    public static void main(String[] args) throws IllegalArgumentException {
        initializeIO();
        try {
            int times = nextInt(), k, max, i;
            int[] arr;
            long count;
  
            while(times -- > 0) {
                arr = new int[nextInt()]; k = nextInt();
                max = arr[0] = nextInt();
                for(i = 1; i < arr.length; i ++) {
                    arr[i] = nextInt();
                    
                    if(arr[i] > max) {
                        max = arr[i];
                    }
                }
                
                count = 0L;
                for(i = k - 1; i < arr.length; i ++) {
                    if(arr[i] == max) {
                        count += arr.length - i;
                    }
                }
                
                outData.append(count).append('\n');
            }
        
        } catch(IllegalArgumentException iae) {
            close();
            throw iae;
        }
        
        close();
    }
    
    
    
    
    
    
    
    
    
    
   /* The methods below are used for low level IO operations
    that will be used in the program. */
     
   /** InputStream with implemented buffering for faster input */
    private static DataInputStream dis;
   /** Buffer for input */
    private static byte[] buffer;
   /** Variables for reading buffer */
    private static int bytesRead, bufferPos;
   /** Unsynchronized Mutable String to store Output */
    private static StringBuilder outData;
    
   /**
    * Initializes the IO objects.
    * To be called before using IO methods.
    * 
    */
    private static void initializeIO() {
        dis = new DataInputStream(System.in);
        buffer = new byte[1 << 16];
        read();
        
        outData = new StringBuilder();
    }
    
   /**
    * Closes IO objects after execution.
    * 
    */
    private static void close() {
        try {
            System.out.print(outData);
            dis.close();
        }
        catch(IOException e) {
        }
    }
    
   /** To store next byte in buffer for Operations. */
    private static byte c;
   /** To store if a integer type data is negative or not. */
    private static boolean neg;
    
   /**
    * @throws IllegalArgumentException If the next input data is not an integer type.
    * 
    * @return The next Integer data from the input data
    * 
    */
    private static int nextInt() throws IllegalArgumentException {
        skipWhiteSpace();
        int temp = 0;
        
        neg = (c == '-');
        if(neg) {
            read();
        }

   	   	do {
   	   	    if(!isDigit()) {
   	   	        throw new IllegalArgumentException();
   	   	    }
   	   	    
     		temp = temp * 10 + c - '0';
    		read();
     	} while(!(c == '\n' || c == ' ' || c == '\r') && (c != -1));
        
        return neg ? -temp : temp;
    }
    
   /**
    * @throws IllegalArgumentException If the next input data is not an integer type.
    * 
    * @return The next Long data in the input data
    * 
    */
    private static long nextLong() throws IllegalArgumentException {
        skipWhiteSpace();
		long temp = 0;

		neg = (c == '-');
		if (neg) {
			read();
		}
		
   	   	do {
   	   	    if(!isDigit()) {
   	   	        throw new IllegalArgumentException();
   	   	    }
   	   	    
     		temp = temp * 10L + c - '0';
    		read();
     	} while(!(c == '\n' || c == ' ' || c == '\r') && (c != -1));

		return neg ? -temp : temp;
	}
	
   /**
    * @throws IllegalArgumentException If the nexxt input data is not float or integer.
    * 
    * @return The next Double data in the input stream.
    * 
    */
	private static double nextDouble() {
	    skipWhiteSpace();
	    double temp = 0.0d;
	    
	    neg = (c == '-');
	    if(neg) {
	        read();
	    }
	    
	    if(c != '.') {
	        do {
   	   	        if(!isDigit()) {
   	   	            throw new IllegalArgumentException();
   	       	    }
   	   	    
     	    	temp = temp * 10.0d + c - '0';
    	    	read();
	        } while(c != '.' && !(c == '\n' || c == ' ' || c == '\r') && (c != -1));
	    }
	    
	    if(c == '.') {
	        double div = 1.0d;
	        read();
	        
	        while(!(c == '\n' || c == ' ' || c == '\r') && (c != -1)) {
   	   	        if(!isDigit()) {
   	   	            throw new IllegalArgumentException();
   	       	    }
   	   	    
     	    	temp = temp * 10.0d + c - '0';
     	    	div *= 10.0d;
    	    	read();
	        }
	        
	        temp /= div;
	    }
	    
	    return neg ? -temp : temp;
	}
	
   /**
    * Checks if a byte is number or not.
    * 
    */
	private static boolean isDigit() {
	    return (c >= '0' && c <= '9');
	}
  
   /** Stores the initial length of the given StringBuilder in the following functions. */
    private static int length;
   
   /**
    * Writes the remaining data from the current line from the input data in the given StringBuilder.
    * 
    * @param sb StringBuilder object in which the data will be stored.
    * @throws IllegalArgumentException If there is no byte left in input data.
    *
    */
    private static void getLine(StringBuilder sb) throws IllegalArgumentException {
        sb.setLength(0);
        
        while(c != -1) {
            if(c == '\n' || c == '\r') {
                break;
            }
            
            sb.append((char)c);
            read();
        }
        
        if(sb.length() == 0) {
            throw new IllegalArgumentException();
        }
    }
    
   /**
    * Writes the next line from the current line from the input data in the given StringBuilder.
    * 
    * @param sb StringBuilder object in which the data will be stored.
    *
    */
    private static void nextLine(StringBuilder sb) {
        skipLine(); getLine(sb);
    }
    
   /**
    * Appends the next word from the input data in the given StringBuilder
    * 
    * @param sb StringBuilder object in which the data will be stored.
    * @throws IllegalArgumentException If there is no byte left in input data.
    * 
    */
    private static void addNext(StringBuilder sb) throws IllegalArgumentException {
        skipWhiteSpace();
        length = sb.length();
        
        while(c != -1) {
            if(c == ' ' || c == '\n' || c == '\r') {
                break;
            }
            
            sb.append((char)c);
            read();
        }
        
        if(sb.length() == length) {
            throw new IllegalArgumentException();
        }
    }
    
   /**
    * Writes the next word from the input data in the given StringBuilder
    * 
    * @param sb StringBuilder object in which the data will be stored.
    *
    */
    private static void next(StringBuilder sb) {
        sb.setLength(0);
        addNext(sb);
    }
    
   /**
    * Skips any prevailing space or empty lines.
    * 
    */ 
    private static void skipWhiteSpace() {
        while((c == '\n' || c == ' ' || c == '\r') && (c != -1)) {
            read();
        }
    }
   
   /**
    * Skips any prevailing space.
    * 
    */
    private static void skipSpace() {
        while(c == ' ' && c != -1) {
            read();
        }
    }
     
   /**
    * Skips a line from the input stream.
    * 
    */
    private static void skipLine() {
        while(c != '\n' && c != '\r' && c != -1) {
            read();
        }
        
        read();
    }
    
   /**
    * Skips a word from the input stream.
    * 
    */
    private static void skipWord() {
        while(c != '\n' && c != ' ' && c != '\r' && c != -1) {
            read();
        }
        
        read();
    }
    
   /**
    * Refills the buffer with new data.
    * 
    */
    private static void fillBuffer() throws IOException {
        bytesRead = dis.read(buffer, bufferPos = 0, buffer.length);
        
        if(bytesRead == -1) {
            buffer[0] = -1;
        }
    }
   
   /**
    * Reads the next byte from the input data and stores it in {@link c}
    * 
    */
    private static void read() {
        if(bufferPos >= bytesRead) {
            try {
                fillBuffer();
            }
            catch(IOException e) {
            }
        }
        
        c = buffer[bufferPos ++];
    }
}
