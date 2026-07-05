package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ijh extends jv8 {
    public final String b;
    public final nz8 c;

    public ijh(String str, String str2, vde vdeVar) {
        super(str);
        fd9.E(!vdeVar.isEmpty());
        this.b = str2;
        nz8 nz8VarQ = nz8.q(vdeVar);
        this.c = nz8VarQ;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.fjb
    public final void b(m7b m7bVar) {
        byte b;
        String str = this.a;
        switch (str.hashCode()) {
            case 82815:
                b = !str.equals("TAL") ? (byte) -1 : (byte) 0;
                break;
            case 82878:
                b = !str.equals("TCM") ? (byte) -1 : (byte) 1;
                break;
            case 82897:
                b = !str.equals("TDA") ? (byte) -1 : (byte) 2;
                break;
            case 83253:
                b = !str.equals("TP1") ? (byte) -1 : (byte) 3;
                break;
            case 83254:
                b = !str.equals("TP2") ? (byte) -1 : (byte) 4;
                break;
            case 83255:
                b = !str.equals("TP3") ? (byte) -1 : (byte) 5;
                break;
            case 83341:
                b = !str.equals("TRK") ? (byte) -1 : (byte) 6;
                break;
            case 83378:
                b = !str.equals("TT2") ? (byte) -1 : (byte) 7;
                break;
            case 83536:
                b = !str.equals("TXT") ? (byte) -1 : (byte) 8;
                break;
            case 83552:
                b = !str.equals("TYE") ? (byte) -1 : (byte) 9;
                break;
            case 2567331:
                b = !str.equals("TALB") ? (byte) -1 : (byte) 10;
                break;
            case 2569357:
                b = !str.equals("TCOM") ? (byte) -1 : (byte) 11;
                break;
            case 2569358:
                b = !str.equals("TCON") ? (byte) -1 : (byte) 12;
                break;
            case 2569891:
                b = !str.equals("TDAT") ? (byte) -1 : (byte) 13;
                break;
            case 2570401:
                b = !str.equals("TDRC") ? (byte) -1 : (byte) 14;
                break;
            case 2570410:
                b = !str.equals("TDRL") ? (byte) -1 : (byte) 15;
                break;
            case 2571565:
                b = !str.equals("TEXT") ? (byte) -1 : (byte) 16;
                break;
            case 2575251:
                b = !str.equals("TIT2") ? (byte) -1 : (byte) 17;
                break;
            case 2581512:
                b = !str.equals("TPE1") ? (byte) -1 : (byte) 18;
                break;
            case 2581513:
                b = !str.equals("TPE2") ? (byte) -1 : (byte) 19;
                break;
            case 2581514:
                b = !str.equals("TPE3") ? (byte) -1 : (byte) 20;
                break;
            case 2583398:
                b = !str.equals("TRCK") ? (byte) -1 : (byte) 21;
                break;
            case 2590194:
                b = !str.equals("TYER") ? (byte) -1 : (byte) 22;
                break;
            default:
                b = -1;
                break;
        }
        nz8 nz8Var = this.c;
        try {
            switch (b) {
                case 0:
                case 10:
                    m7bVar.c = (CharSequence) nz8Var.get(0);
                    break;
                case 1:
                case 11:
                    m7bVar.s = (CharSequence) nz8Var.get(0);
                    break;
                case 2:
                case 13:
                    String str2 = (String) nz8Var.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i2 = Integer.parseInt(str2.substring(0, 2));
                    m7bVar.m = Integer.valueOf(i);
                    m7bVar.n = Integer.valueOf(i2);
                    break;
                case 3:
                case g.AVG_FIELD_NUMBER /* 18 */:
                    m7bVar.b = (CharSequence) nz8Var.get(0);
                    break;
                case 4:
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    m7bVar.d = (CharSequence) nz8Var.get(0);
                    break;
                case 5:
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    m7bVar.t = (CharSequence) nz8Var.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = (String) nz8Var.get(0);
                    String str4 = tpi.a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    m7bVar.h = Integer.valueOf(i3);
                    m7bVar.i = numValueOf;
                    break;
                case 7:
                case g.MAX_FIELD_NUMBER /* 17 */:
                    m7bVar.a = (CharSequence) nz8Var.get(0);
                    break;
                case 8:
                case 16:
                    m7bVar.r = (CharSequence) nz8Var.get(0);
                    break;
                case 9:
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    m7bVar.l = Integer.valueOf(Integer.parseInt((String) nz8Var.get(0)));
                    break;
                case 12:
                    Integer numM = nwk.m((String) nz8Var.get(0));
                    if (numM != null) {
                        String strA = lv8.a(numM.intValue());
                        if (strA != null) {
                            m7bVar.w = strA;
                        }
                    } else {
                        m7bVar.w = (CharSequence) nz8Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) nz8Var.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                m7bVar.n = (Integer) arrayListD.get(2);
                            }
                        }
                        m7bVar.m = (Integer) arrayListD.get(1);
                    }
                    m7bVar.l = (Integer) arrayListD.get(0);
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    ArrayList arrayListD2 = d((String) nz8Var.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                m7bVar.q = (Integer) arrayListD2.get(2);
                            }
                        }
                        m7bVar.p = (Integer) arrayListD2.get(1);
                    }
                    m7bVar.o = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ijh.class != obj.getClass()) {
            return false;
        }
        ijh ijhVar = (ijh) obj;
        return this.a.equals(ijhVar.a) && Objects.equals(this.b, ijhVar.b) && this.c.equals(ijhVar.c);
    }

    public final int hashCode() {
        int iL = kgh.l(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iL + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.jv8
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
