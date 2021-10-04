Paris Mollo - L2 INFORMATIQUE Groupe 3
# Exercice 4 - Problème du drapeau hollandais
## 4.1
```java
	public static void dutch_three(int[] arr, int mid_value){
		int bottom_index = 0;
		int current_index = 0;
		int top_index = arr.length - 1;

		while (current_index<=top_index){
			if (arr[current_index]<mid_value){
				// If value < mid value we will update the top-bottom index and it's respective elements, then move on to the next on the list 
				int aux = arr[current_index];
				arr[current_index] = arr[bottom_index];
				arr[bottom_index] = aux;
				current_index++;//next element
				bottom_index++; // update top-bottom index,any value before it is sorted.
			}
			else if (arr[current_index]>mid_value){
				int aux = arr[current_index];
				arr[current_index] = arr[top_index];
				arr[top_index] = aux;
				top_index--; 
			}else{
				current_index++;
			}
		}
	}

```
## 4.2 / 4.3 / 4.5 / 4.6
- La boucle while s'arrête lorsque qu'on la valeur current est >= au indice supérieur (la valeur g) qui va decrémenter pendant que m va incrémenter. 

- La tâche consiste à trier les tableaux de 0, 1 et 2 en temps linéaire sans espace supplémentaire. Comme le tableau n’est parcouru qu’une seule fois, la complexité temporelle de l’algorithme indiqué ci-dessous est O(n).