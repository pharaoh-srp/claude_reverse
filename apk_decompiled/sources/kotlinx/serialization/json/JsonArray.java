package kotlinx.serialization.json;

import defpackage.dch;
import defpackage.lg9;
import defpackage.mdj;
import defpackage.mm9;
import defpackage.onf;
import defpackage.w44;
import defpackage.x44;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b\u0007\u0018\u0000 \"2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\"B\u0017\bF\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0082\u0004J\n\u0010\n\u001a\u00020\u000bH\u0096\u0080\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\u0012\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0083\u0004J\u0018\u0010\u0010\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0096\u0081\u0004J\u0012\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u000bH\u0096\u0083\u0004J\u0012\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0007H\u0096\u0081\u0004J\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0096\u0083\u0004J\u0012\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0081\u0004J\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001bH\u0096\u0081\u0004J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0096\u0081\u0004J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0096\u0081\u0004R\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002X\u0082\u0084\b¢\u0006\u0002\n\u0000R\u0013\u0010\u001f\u001a\u00020\u000bX\u0096\u0085\b¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonElement;", "", "content", "<init>", "(Ljava/util/List;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "contains", "element", "containsAll", "elements", "", "get", "index", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "size", "getSize", "()I", "Companion", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = mdj.f)
@onf(with = lg9.class)
public final class JsonArray extends JsonElement implements List<JsonElement>, mm9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final List<JsonElement> content;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/JsonArray$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = mdj.f)
    public static final class Companion {
        public final KSerializer serializer() {
            return lg9.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonArray(List<? extends JsonElement> list) {
        super(null);
        list.getClass();
        this.content = list;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof JsonElement) {
            return contains((JsonElement) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        elements.getClass();
        return this.content.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object other) {
        return x44.r(this.content, other);
    }

    @Override // java.util.List
    public JsonElement get(int index) {
        return this.content.get(index);
    }

    public int getSize() {
        return this.content.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof JsonElement) {
            return indexOf((JsonElement) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return this.content.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof JsonElement) {
            return lastIndexOf((JsonElement) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<JsonElement> listIterator() {
        return this.content.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ JsonElement remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ JsonElement set(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<JsonElement> subList(int fromIndex, int toIndex) {
        return this.content.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) dch.U(this, tArr);
    }

    public String toString() {
        return w44.S0(this.content, ",", "[", "]", null, 56);
    }

    @Override // java.util.List
    public ListIterator<JsonElement> listIterator(int index) {
        return this.content.listIterator(index);
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: remove, reason: avoid collision after fix types in other method */
    public JsonElement remove2(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public JsonElement set2(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return dch.T(this);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(JsonElement element) {
        element.getClass();
        return this.content.contains(element);
    }

    public int indexOf(JsonElement element) {
        element.getClass();
        return this.content.indexOf(element);
    }

    public int lastIndexOf(JsonElement element) {
        element.getClass();
        return this.content.lastIndexOf(element);
    }
}
