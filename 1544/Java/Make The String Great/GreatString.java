class GreatString {
    public String makeGood(String s) {
        
        StringBuffer sb = new StringBuffer(s); 
        boolean isDeleted = false;
        do{
            if(s.length() <= 1){
                return s;
            }
      
            isDeleted = false;
            for(int i=0;i<=sb.length()-2;i++){
                if ((sb.charAt(i) - sb.charAt(i+1) == 32) || (sb.charAt(i+1) - sb.charAt(i) == 32)) {
                    sb.delete(i,i+2);
                    isDeleted=true;
                    break;
                }   
            }

        }while(isDeleted);
        return sb.toString();    
    }
}
