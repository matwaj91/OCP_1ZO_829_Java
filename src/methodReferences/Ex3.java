package methodReferences;

// What is the result?

interface Creator1<T, R> {

    R create(T t);
}

class Log {

    Log() {
        System.out.println(1);
    }

    Log(String name) {
        System.out.println(2);
    }
}

public class Ex3 {

    public static void main(String[] args) {
        Creator1<String, Log> obj = Log::new;
    }

//    It executes fine but no output
}