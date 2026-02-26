import java.util.stream.Gatherer;
import java.util.stream.Stream;

class Sample {
    public static void main(String[] args) {
        Gatherer<Integer, ?, Integer> last = Gatherer.of((state, item, downstream) -> {
            state.set(item);
            return true;
        }, (state, downstream) -> downstream.push(state.get()));

        int v = Stream.of(1, 2, 3)
                .gather(last)
                .findFirst()
                .orElse(-1);
        System.out.println(v);
    }
}
