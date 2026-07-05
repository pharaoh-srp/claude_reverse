package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class q8f extends t3 {
    public long G;
    public long[] H;
    public long[] I;

    public static Serializable p(int i, ssc sscVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(sscVar.t()));
        }
        if (i == 1) {
            return Boolean.valueOf(sscVar.z() == 1);
        }
        if (i == 2) {
            return r(sscVar);
        }
        if (i != 3) {
            if (i == 8) {
                return q(sscVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(sscVar.t()));
                sscVar.N(2);
                return date;
            }
            int iD = sscVar.D();
            ArrayList arrayList = new ArrayList(iD);
            for (int i2 = 0; i2 < iD; i2++) {
                Serializable serializableP = p(sscVar.z(), sscVar);
                if (serializableP != null) {
                    arrayList.add(serializableP);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strR = r(sscVar);
            int iZ = sscVar.z();
            if (iZ == 9) {
                return map;
            }
            Serializable serializableP2 = p(iZ, sscVar);
            if (serializableP2 != null) {
                map.put(strR, serializableP2);
            }
        }
    }

    public static HashMap q(ssc sscVar) {
        int iD = sscVar.D();
        HashMap map = new HashMap(iD);
        for (int i = 0; i < iD; i++) {
            String strR = r(sscVar);
            Serializable serializableP = p(sscVar.z(), sscVar);
            if (serializableP != null) {
                map.put(strR, serializableP);
            }
        }
        return map;
    }

    public static String r(ssc sscVar) {
        int iG = sscVar.G();
        int i = sscVar.b;
        sscVar.N(iG);
        return new String(sscVar.a, i, iG);
    }
}
