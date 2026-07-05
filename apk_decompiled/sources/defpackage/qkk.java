package defpackage;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class qkk extends xlk {
    public final pzj E;
    public final int F;

    public qkk(e2k e2kVar) throws zzhf {
        e2kVar.getClass();
        this.E = e2kVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            pzj pzjVar = this.E;
            if (i >= pzjVar.size()) {
                break;
            }
            int iB = ((xlk) pzjVar.get(i)).b();
            if (i2 < iB) {
                i2 = iB;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.F = i3;
        if (i3 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.xlk
    public final int a() {
        return xlk.d((byte) -128);
    }

    @Override // defpackage.xlk
    public final int b() {
        return this.F;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        xlk xlkVar = (xlk) obj;
        int iA = xlkVar.a();
        int iD = xlk.d((byte) -128);
        if (iD != iA) {
            return iD - xlkVar.a();
        }
        pzj pzjVar = ((qkk) xlkVar).E;
        pzj pzjVar2 = this.E;
        if (pzjVar2.size() != pzjVar.size()) {
            return pzjVar2.size() - pzjVar.size();
        }
        for (int i = 0; i < pzjVar2.size(); i++) {
            int iCompareTo = ((xlk) pzjVar2.get(i)).compareTo((xlk) pzjVar.get(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qkk.class == obj.getClass()) {
            return this.E.equals(((qkk) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(xlk.d((byte) -128)), this.E});
    }

    public final String toString() {
        pzj pzjVar = this.E;
        if (pzjVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = pzjVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((xlk) pzjVar.get(i)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(bm4.s(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(bm4.s(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            sz6.h(e);
            return null;
        }
    }
}
