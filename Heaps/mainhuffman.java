public class mainhuffman {
    public static void main(String[] args) throws Exception{            
        String str = "abbccda";
        HuffmanCoder hf = new HuffmanCoder(str);
        String cs = hf.encode(str);
        System.out.println(cs);
        String dc = hf.decode(cs);
        System.out.println(dc);
    }
    //bitset can be used it is like an array but with bit at each index
}
        
