public class SortUtil {

    public static <T> void sort (Precedente<T>[] arr){
            int n = arr.length;
            while (n > 0)
            {
                int aux = 0;
                for (int i = 1; i < n; i++)
                {
                    if ((arr[i - 1].precedeA((T) arr[i])) > 0)
                    {
                        Precedente<T> temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                        aux = i;
                    }
                }
                n = aux;
            }
        }
    }

