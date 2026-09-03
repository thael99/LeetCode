import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LeetCode347 {
    static void main (String[] args){
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));
    }

    static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i=0; i<nums.length; i++){          //montando o mapa. Números do vetor de entrada são as chaves e a frequencia que eles aparecem são os valores
            if (numsMap.containsKey(nums[i])){
                numsMap.put((nums[i]),(numsMap.get(nums[i])+1));

            }
            else {
                numsMap.put((nums[i]),1);
            }
        }
        //int[] vet = new int[nums.length];
        //ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        ArrayList<Integer>[] matriz = new ArrayList[nums.length+1]; //vetor de arrays com tamanho fixo do tamanho do veotr de entrada

        for (Integer keyMap : numsMap.keySet()){
            if (matriz[numsMap.get(keyMap)] == null) {
                matriz[numsMap.get(keyMap)] = new ArrayList<>(); //criando um array na posição do vetor referente à frequencia dos números do vetor de entrada
            }
            matriz[numsMap.get(keyMap)].add(keyMap); //guardando a chave do mapa na posição do vetor referente à frequencia que ela aparece no vetor de entrada
        }
        int [] retorno = new int[k];
        int posicao ;
        int posicao2 = 0;
//        for (Integer keyMap : numsMap.keySet()){
//            System.out.println(keyMap);
//        }

        busca:
/*        for (int i=1; i<= nums.length; i++){
            for (int elemento: matriz[posicao]){
                retorno [posicao2] = elemento;
                posicao2++;
                if (posicao2 == k){
                    break busca;
                }
            }
        }
  */
        for (int i=matriz.length -1; i>=0; i--){

//        }
 //       for (ArrayList<Integer> teste : matriz){
            //posicao = numsMap.get(keyMap);
            if (matriz[i] != null) {
                for (int elemento : matriz[i]) {

                    retorno[posicao2] = elemento;
                    posicao2++;
                    if (posicao2 == k) {
                        break busca;
                    }
                }
            }
        }

        return retorno;
    }
}
