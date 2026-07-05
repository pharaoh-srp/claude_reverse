package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class buj {
    public static final buj f = new buj((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public buj(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(ork.class);
        this.e = enumMap;
        enumMap.put(ork.AD_USER_DATA, bool == null ? mrk.UNINITIALIZED : bool.booleanValue() ? mrk.GRANTED : mrk.DENIED);
        this.a = i;
        this.b = e();
        this.c = bool2;
        this.d = str;
    }

    public static Boolean a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i = vtj.a[qrk.d(bundle.getString("ad_personalization")).ordinal()];
        if (i == 3) {
            return Boolean.FALSE;
        }
        if (i != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static buj b(int i, Bundle bundle) {
        if (bundle == null) {
            return new buj((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(ork.class);
        for (ork orkVar : srk.DMA.E) {
            enumMap.put(orkVar, qrk.d(bundle.getString(orkVar.E)));
        }
        return new buj(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static buj c(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(ork.class);
        ork[] orkVarArr = srk.DMA.E;
        int length = orkVarArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(orkVarArr[i3], qrk.c(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new buj(enumMap, i, (Boolean) null, (String) null);
    }

    public final mrk d() {
        mrk mrkVar = (mrk) this.e.get(ork.AD_USER_DATA);
        return mrkVar == null ? mrk.UNINITIALIZED : mrkVar;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (ork orkVar : srk.DMA.E) {
            sb.append(":");
            sb.append(qrk.a((mrk) this.e.get(orkVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof buj)) {
            return false;
        }
        buj bujVar = (buj) obj;
        if (this.b.equalsIgnoreCase(bujVar.b) && Objects.equals(this.c, bujVar.c)) {
            return Objects.equals(this.d, bujVar.d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.c;
        int i = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * 137) + (i * 29) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(qrk.b(this.a));
        for (ork orkVar : srk.DMA.E) {
            sb.append(",");
            sb.append(orkVar.E);
            sb.append("=");
            mrk mrkVar = (mrk) this.e.get(orkVar);
            if (mrkVar == null) {
                sb.append("uninitialized");
            } else {
                int i = vtj.a[mrkVar.ordinal()];
                if (i == 1) {
                    sb.append("uninitialized");
                } else if (i == 2) {
                    sb.append("eu_consent_policy");
                } else if (i == 3) {
                    sb.append("denied");
                } else if (i == 4) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public buj(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(ork.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = e();
        this.c = bool;
        this.d = str;
    }
}
