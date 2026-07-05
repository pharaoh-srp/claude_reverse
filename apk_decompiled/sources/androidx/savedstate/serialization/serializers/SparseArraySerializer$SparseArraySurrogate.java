package androidx.savedstate.serialization.serializers;

import defpackage.e79;
import defpackage.gvj;
import defpackage.kgg;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000 \u001d*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u001e\u001fB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJG\u0010\u0018\u001a\u00020\u0015\"\n\b\u0002\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006 "}, d2 = {"androidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate", "T", "", "", "", "keys", "values", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Liei;", "write$Self$savedstate", "(Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "getValues", "Companion", "androidx/savedstate/serialization/serializers/b", "kgg", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
@onf
final class SparseArraySerializer$SparseArraySurrogate<T> {
    private static final SerialDescriptor $cachedDescriptor;
    private final List<Integer> keys;
    private final List<T> values;
    public static final kgg Companion = new kgg();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new a()), null};

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        pluginGeneratedSerialDescriptor.j("keys", false);
        pluginGeneratedSerialDescriptor.j("values", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ SparseArraySerializer$SparseArraySurrogate(int i, List list, List list2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, $cachedDescriptor);
            throw null;
        }
        this.keys = list;
        this.values = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(e79.a, 0);
    }

    public static final /* synthetic */ void write$Self$savedstate(SparseArraySerializer$SparseArraySurrogate self, vd4 output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.keys);
        output.r(serialDesc, 1, new uo0(typeSerial0, 0), self.values);
    }

    public final List<Integer> getKeys() {
        return this.keys;
    }

    public final List<T> getValues() {
        return this.values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparseArraySerializer$SparseArraySurrogate(List<Integer> list, List<? extends T> list2) {
        list.getClass();
        list2.getClass();
        this.keys = list;
        this.values = list2;
    }
}
