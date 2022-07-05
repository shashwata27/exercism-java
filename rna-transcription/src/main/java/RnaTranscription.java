import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        String ret="";
        Map<Character,Character> rna=Map.of(
                'G','C',
                'C','G',
                'T','A',
                'A','U'
        );
        for(char strand:dnaStrand.toCharArray()){
            ret+=rna.get(strand);
        }
        return ret;
    }

}
