package defpackage;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.e;
import androidx.datastore.preferences.protobuf.f;
import androidx.health.platform.client.proto.g;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class th7 {
    public static final /* synthetic */ int c = 0;
    public final fbg a = fbg.g();
    public boolean b;

    static {
        new th7(0);
    }

    public th7(int i) {
        a();
        a();
    }

    public static void b(e eVar, cfj cfjVar, int i, Object obj) throws IOException {
        if (cfjVar == cfj.H) {
            eVar.A(i, 3);
            ((f) ((a) obj)).l(eVar);
            eVar.A(i, 4);
        }
        eVar.A(i, cfjVar.F);
        switch (cfjVar.ordinal()) {
            case 0:
                eVar.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                eVar.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                eVar.E(((Long) obj).longValue());
                break;
            case 3:
                eVar.E(((Long) obj).longValue());
                break;
            case 4:
                eVar.w(((Integer) obj).intValue());
                break;
            case 5:
                eVar.u(((Long) obj).longValue());
                break;
            case 6:
                eVar.s(((Integer) obj).intValue());
                break;
            case 7:
                eVar.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof i22)) {
                    eVar.z((String) obj);
                } else {
                    eVar.q((i22) obj);
                }
                break;
            case 9:
                ((f) ((a) obj)).l(eVar);
                break;
            case 10:
                a aVar = (a) obj;
                eVar.C(((f) aVar).a(null));
                ((f) aVar).l(eVar);
                break;
            case 11:
                if (!(obj instanceof i22)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    eVar.C(length);
                    eVar.n(bArr, 0, length);
                } else {
                    eVar.q((i22) obj);
                }
                break;
            case 12:
                eVar.C(((Integer) obj).intValue());
                break;
            case 13:
                eVar.w(((Integer) obj).intValue());
                break;
            case 14:
                eVar.s(((Integer) obj).intValue());
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                eVar.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                eVar.C((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                eVar.E((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        fbg fbgVar = this.a;
        int i = fbgVar.F;
        for (int i2 = 0; i2 < i; i2++) {
            Object value = fbgVar.d(i2).getValue();
            if (value instanceof f) {
                ((f) value).g();
            }
        }
        Iterator it = fbgVar.e().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof f) {
                ((f) value2).g();
            }
        }
        if (!fbgVar.H) {
            if (fbgVar.F > 0) {
                fbgVar.d(0).getKey().getClass();
                mr9.o();
                return;
            } else {
                Iterator it2 = fbgVar.e().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    mr9.o();
                    return;
                }
            }
        }
        if (!fbgVar.H) {
            fbgVar.G = fbgVar.G.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(fbgVar.G);
            fbgVar.J = fbgVar.J.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(fbgVar.J);
            fbgVar.H = true;
        }
        this.b = true;
    }

    public final Object clone() {
        th7 th7Var = new th7();
        fbg fbgVar = this.a;
        if (fbgVar.F > 0) {
            ij0.x(fbgVar.d(0).getKey());
            throw null;
        }
        Iterator it = fbgVar.e().iterator();
        if (!it.hasNext()) {
            return th7Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ij0.x(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof th7) {
            return this.a.equals(((th7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public th7() {
    }
}
