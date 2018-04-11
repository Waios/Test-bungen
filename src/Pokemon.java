import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Pokemon implements Comparator<Pokemon>, Comparable<Pokemon>{
    private String name;
    private int age;
    Pokemon(){
    }

    Pokemon(String n, int a){
        name = n;
        age = a;
    }

    public String getPokemonName(){
        return name;
    }

    public int getPokemonAge(){
        return age;
    }

    @Override
    public int compareTo(Pokemon o) {
        return 0;
    }

    @Override
    public int compare(Pokemon o1, Pokemon o2) {
        return 0;
    }
}

class Example{
    public static void main(String args[]){

        List<Pokemon> list = new ArrayList<Pokemon>();

        list.add(new Pokemon("Glumanda",3));
        list.add(new Pokemon("Pikachu",6));
        list.add(new Pokemon("Bisasam",10));
        list.add(new Pokemon("Schiggy",8));
        list.add(new Pokemon("Raupy",1));
        Collections.sort(list);// Sorts the array list

        for(Pokemon aPokemon: list)
        System.out.print(aPokemon.getPokemonName() + ", ");
        //list.sort(Comparator.comparing(Pokemon :: getPokemonName));


        //Collections.sort(list, new Pokemon());
        list.sort(Comparator.comparing(Pokemon :: getPokemonAge));

        System.out.println();
        for(Pokemon aPokemon: list)//printing the sorted list of ages
            System.out.print(aPokemon.getPokemonName() +"  : "+
                    aPokemon.getPokemonAge() + ", ");
    }
}