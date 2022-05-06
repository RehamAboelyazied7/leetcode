class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int ransomNoteLength = ransomNote.length();
        boolean construct = false;
        char[] magazineCharacters = magazine.toCharArray();
        for(int i=0; i<ransomNoteLength; i++){
            for(int j=0 ; j<magazineCharacters.length; j++){
                if(ransomNote.charAt(i) == magazineCharacters[j]){
                    construct =  true;
                    magazineCharacters[j] = 'X';
                    break;
                }else{
                    construct = false;
                }
            }
            if(!construct){
                break;
            }
        }
        return construct;
    }
}