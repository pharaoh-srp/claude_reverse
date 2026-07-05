package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class fae extends s44 {
    public final pl9 b;
    public final no0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fae(pl9 pl9Var, KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.b = pl9Var;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        descriptor.getClass();
        this.c = new no0(descriptor, 0);
    }

    @Override // defpackage.x0
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.x0
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.x0
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new f2(objArr);
    }

    @Override // defpackage.x0
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // defpackage.x0
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) ez1.I(this.b), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.s44
    public final void i(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
