import java.util.Arrays;
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {
        Arrays.fill(storage, 0, size,null);
        size = 0;
    }

    void save(Resume r) {
        if(size < storage.length){
            storage[size] = r;
            size++;
        }
    }

    Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid == uuid) {
                storage[i] = storage[size - 1];
                return storage[i];
            }
        }
        size--;
        return null;

    }

    void delete(String uuid) {
        for (int i = 0; i < size; i ++){
            if(storage[i].uuid == uuid)
                storage[i] = storage[size - 1];
        }
        size--;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    int size() {
        return size;
    }
}
