package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class csa extends kq6 {
    public final /* synthetic */ int d;
    public final jnf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csa(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        super(kSerializer, kSerializer2);
        this.d = i;
        kSerializer.getClass();
        kSerializer2.getClass();
        switch (i) {
            case 1:
                super(kSerializer, kSerializer2);
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (bsg.I0("kotlin.Pair")) {
                    sz6.p("Blank serial names are prohibited");
                    throw null;
                }
                oh3 oh3Var = new oh3("kotlin.Pair");
                oh3Var.a("first", kSerializer.getDescriptor());
                oh3Var.a("second", kSerializer2.getDescriptor());
                this.e = new jnf("kotlin.Pair", vsg.l, oh3Var.c.size(), mp0.Y0(serialDescriptorArr), oh3Var);
                return;
            default:
                this.e = j8.n("kotlin.collections.Map.Entry", vsg.n, new SerialDescriptor[0], new f25(kSerializer, 25, kSerializer2));
                return;
        }
    }

    @Override // defpackage.kq6
    public final Object a(Object obj) {
        switch (this.d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey();
            default:
                cpc cpcVar = (cpc) obj;
                cpcVar.getClass();
                return cpcVar.E;
        }
    }

    @Override // defpackage.kq6
    public final Object b(Object obj) {
        switch (this.d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getValue();
            default:
                cpc cpcVar = (cpc) obj;
                cpcVar.getClass();
                return cpcVar.F;
        }
    }

    @Override // defpackage.kq6
    public final Object c(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return new bsa(obj, obj2);
            default:
                return new cpc(obj, obj2);
        }
    }

    @Override // defpackage.kq6, defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        switch (this.d) {
        }
        return this.e;
    }
}
