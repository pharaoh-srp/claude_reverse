package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class uo0 extends u44 {
    public final /* synthetic */ int b;
    public final q9a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo0(KSerializer kSerializer, int i) {
        super(kSerializer);
        this.b = i;
        kSerializer.getClass();
        switch (i) {
            case 1:
                super(kSerializer);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                descriptor.getClass();
                this.c = new to0(descriptor, 1);
                break;
            default:
                SerialDescriptor descriptor2 = kSerializer.getDescriptor();
                descriptor2.getClass();
                this.c = new to0(descriptor2, 0);
                break;
        }
    }

    @Override // defpackage.x0
    public final Object a() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.x0
    public final int b(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        switch (this.b) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        switch (this.b) {
        }
        return (to0) this.c;
    }

    @Override // defpackage.x0
    public final Object h(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // defpackage.s44
    public final void i(Object obj, int i, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }
}
