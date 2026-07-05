package defpackage;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class llk extends xlk {
    public final int E;
    public final o0k F;

    public llk(o0k o0kVar) throws zzhf {
        o0kVar.getClass();
        this.F = o0kVar;
        efi efiVarK = o0kVar.entrySet().k();
        int i = 0;
        while (efiVarK.hasNext()) {
            Map.Entry entry = (Map.Entry) efiVarK.next();
            int iB = ((xlk) entry.getKey()).b();
            i = i < iB ? iB : i;
            int iB2 = ((xlk) entry.getValue()).b();
            if (i < iB2) {
                i = iB2;
            }
        }
        int i2 = i + 1;
        this.E = i2;
        if (i2 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.xlk
    public final int a() {
        return xlk.d((byte) -96);
    }

    @Override // defpackage.xlk
    public final int b() {
        return this.E;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        xlk xlkVar = (xlk) obj;
        int iA = xlkVar.a();
        int iD = xlk.d((byte) -96);
        if (iD != iA) {
            return iD - xlkVar.a();
        }
        o0k o0kVar = ((llk) xlkVar).F;
        o0k o0kVar2 = this.F;
        if (o0kVar2.H.size() != o0kVar.H.size()) {
            return o0kVar2.H.size() - o0kVar.H.size();
        }
        efi efiVarK = o0kVar2.entrySet().k();
        efi efiVarK2 = o0kVar.entrySet().k();
        do {
            if (!efiVarK.hasNext() && !efiVarK2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) efiVarK.next();
            Map.Entry entry2 = (Map.Entry) efiVarK2.next();
            int iCompareTo2 = ((xlk) entry.getKey()).compareTo((xlk) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((xlk) entry.getValue()).compareTo((xlk) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && llk.class == obj.getClass()) {
            return this.F.equals(((llk) obj).F);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(xlk.d((byte) -96)), this.F});
    }

    public final String toString() {
        o0k o0kVar = this.F;
        if (o0kVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        efi efiVarK = o0kVar.entrySet().k();
        while (efiVarK.hasNext()) {
            Map.Entry entry = (Map.Entry) efiVarK.next();
            linkedHashMap.put(((xlk) entry.getKey()).toString().replace("\n", "\n  "), ((xlk) entry.getValue()).toString().replace("\n", "\n  "));
        }
        bm4 bm4Var = new bm4();
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            uok.n(sb, linkedHashMap.entrySet().iterator(), bm4Var);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            sz6.h(e);
            return null;
        }
    }
}
