import java.util.Arrays;

public class ArrayStorage {
Resume[] storage = new Resume[10000];

int size = 0;

void clear() {
Arrays.fill(storage, 0, size, null);
size =0;
}

void save(Resume resume) {
if(size < storage.length ){
storage[size] = resume;
size++;
}
}

Resume get(String uuid) {
if(storage[0].uuid == uuid ){
return storage[0];
}
return null;
}

void delete(String uuid) {
for(int i = 0; i < size; i ++) {
if(storage[i].uuid.equals(uuid)){
storage[i] = storage[size - 1];
storage[size -1] = null;
size--;
return;

}
}

}
/**
* @return array, contains only Resumes in storage (without null)
*/
Resume[] getAll() {
return Arrays.copyOf(storage, size);
}

int size() {
return 0;
}
}
