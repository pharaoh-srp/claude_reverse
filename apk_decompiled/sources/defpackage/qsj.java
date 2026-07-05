package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class qsj implements lsj, Iterable {
    public final String E;

    public qsj(String str) {
        if (str != null) {
            this.E = str;
        } else {
            sz6.p("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // defpackage.lsj
    public final Double a() {
        String str = this.E;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qsj) {
            return this.E.equals(((qsj) obj).E);
        }
        return false;
    }

    @Override // defpackage.lsj
    public final Iterator g() {
        return new wsj(1, this);
    }

    @Override // defpackage.lsj
    public final String h() {
        return this.E;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new wsj(0, this);
    }

    @Override // defpackage.lsj
    public final Boolean k() {
        return Boolean.valueOf(!this.E.isEmpty());
    }

    @Override // defpackage.lsj
    public final lsj l() {
        return new qsj(this.E);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lsj
    public final lsj m(String str, c61 c61Var, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String strH;
        int i;
        int i2;
        int i3;
        c61 c61Var2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                sz6.p(str.concat(" is not a String function"));
                return null;
            }
        }
        byte b = -1;
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                if (str.equals(str4)) {
                    b = 0;
                }
                break;
            case -1776922004:
                str5 = "charAt";
                str6 = "toString";
                str4 = str2;
                if (str.equals(str6)) {
                    b = 1;
                }
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    str4 = str2;
                    str6 = "toString";
                    b = 2;
                }
                str4 = str2;
                str6 = "toString";
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    b = 3;
                }
                str4 = str2;
                str6 = "toString";
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b = 4;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = 5;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -906336856:
                if (str.equals("search")) {
                    b = 6;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b = 7;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 8;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b = 9;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 3568674:
                if (str.equals(str3)) {
                    b = 10;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 11;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 12;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 13;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 14;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 15;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b = 16;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                break;
        }
        strH = "undefined";
        String str7 = str4;
        String str8 = this.E;
        switch (b) {
            case 0:
                gqk.n(arrayList, 1, str7);
                lsj lsjVarN = ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0));
                if (!"length".equals(lsjVarN.h())) {
                    double dDoubleValue = lsjVarN.a().doubleValue();
                    if (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str8.length()) {
                        return lsj.B;
                    }
                }
                return lsj.A;
            case 1:
                gqk.n(arrayList, 0, str6);
                return this;
            case 2:
                gqk.n(arrayList, 0, "toLocaleLowerCase");
                return new qsj(str8.toLowerCase());
            case 3:
                gqk.u(1, str5, arrayList);
                int i4 = !arrayList.isEmpty() ? (int) gqk.i(((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0)).a().doubleValue()) : 0;
                return (i4 < 0 || i4 >= str8.length()) ? lsj.C : new qsj(String.valueOf(str8.charAt(i4)));
            case 4:
                if (!arrayList.isEmpty()) {
                    StringBuilder sb = new StringBuilder(str8);
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        sb.append(((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(i5)).h());
                    }
                    return new qsj(sb.toString());
                }
                return this;
            case 5:
                gqk.n(arrayList, 0, "toLowerCase");
                return new qsj(str8.toLowerCase(Locale.ENGLISH));
            case 6:
                gqk.u(1, "search", arrayList);
                return Pattern.compile(arrayList.isEmpty() ? "undefined" : ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0)).h()).matcher(str8).find() ? new yqj(Double.valueOf(r0.start())) : new yqj(Double.valueOf(-1.0d));
            case 7:
                gqk.n(arrayList, 0, "toLocaleUpperCase");
                return new qsj(str8.toUpperCase());
            case 8:
                gqk.u(2, "lastIndexOf", arrayList);
                strH = arrayList.size() > 0 ? ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0)).h() : "undefined";
                return new yqj(Double.valueOf(str8.lastIndexOf(strH, (int) (Double.isNaN(arrayList.size() < 2 ? Double.NaN : ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(1)).a().doubleValue()) ? Double.POSITIVE_INFINITY : gqk.i(r2)))));
            case 9:
                gqk.n(arrayList, 0, "toUpperCase");
                return new qsj(str8.toUpperCase(Locale.ENGLISH));
            case 10:
                gqk.n(arrayList, 0, "toUpperCase");
                return new qsj(str8.trim());
            case 11:
                gqk.u(1, "match", arrayList);
                Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? "" : ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0)).h()).matcher(str8);
                return matcher.find() ? new jqj(new qsj(matcher.group())) : lsj.w;
            case 12:
                gqk.u(2, "slice", arrayList);
                double dI = gqk.i(!arrayList.isEmpty() ? ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0)).a().doubleValue() : 0.0d);
                int iMax = (int) (dI < 0.0d ? Math.max(((double) str8.length()) + dI, 0.0d) : Math.min(dI, str8.length()));
                double dI2 = gqk.i(arrayList.size() > 1 ? ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(1)).a().doubleValue() : str8.length());
                return new qsj(str8.substring(iMax, Math.max(0, ((int) (dI2 < 0.0d ? Math.max(((double) str8.length()) + dI2, 0.0d) : Math.min(dI2, str8.length()))) - iMax) + iMax));
            case 13:
                gqk.u(2, "split", arrayList);
                if (str8.length() == 0) {
                    return new jqj(this);
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    String strH2 = ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0)).h();
                    long jQ = arrayList.size() > 1 ? ((long) gqk.q(((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(1)).a().doubleValue())) & 4294967295L : 2147483647L;
                    if (jQ == 0) {
                        return new jqj();
                    }
                    String[] strArrSplit = str8.split(Pattern.quote(strH2), ((int) jQ) + 1);
                    int length = strArrSplit.length;
                    if (!strH2.isEmpty() || strArrSplit.length <= 0) {
                        i2 = 0;
                    } else {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i2 = zIsEmpty;
                        if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
                            length = strArrSplit.length - 1;
                            i2 = zIsEmpty;
                        }
                    }
                    if (strArrSplit.length > jQ) {
                        length--;
                    }
                    while (i2 < length) {
                        arrayList2.add(new qsj(strArrSplit[i2]));
                        i2++;
                    }
                }
                return new jqj(arrayList2);
            case 14:
                gqk.u(2, "substring", arrayList);
                int i6 = !arrayList.isEmpty() ? (int) gqk.i(((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0)).a().doubleValue()) : 0;
                int i7 = arrayList.size() > 1 ? (int) gqk.i(((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(1)).a().doubleValue()) : str8.length();
                int iMin = Math.min(Math.max(i6, 0), str8.length());
                int iMin2 = Math.min(Math.max(i7, 0), str8.length());
                return new qsj(str8.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                gqk.u(2, "replace", arrayList);
                boolean zIsEmpty2 = arrayList.isEmpty();
                lsj lsjVarC = lsj.v;
                if (!zIsEmpty2) {
                    strH = ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0)).h();
                    if (arrayList.size() > 1) {
                        lsjVarC = ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(1));
                    }
                }
                int iIndexOf = str8.indexOf(strH);
                if (iIndexOf >= 0) {
                    if (lsjVarC instanceof nrj) {
                        i3 = 0;
                        lsjVarC = ((nrj) lsjVarC).c(c61Var, Arrays.asList(new qsj(strH), new yqj(Double.valueOf(iIndexOf)), this));
                    } else {
                        i3 = 0;
                    }
                    return new qsj(ij0.C(str8.substring(i3, iIndexOf), lsjVarC.h(), str8.substring(strH.length() + iIndexOf)));
                }
                return this;
            case 16:
                gqk.u(2, "indexOf", arrayList);
                if (arrayList.size() <= 0) {
                    c61Var2 = c61Var;
                } else {
                    c61Var2 = c61Var;
                    strH = ((mvd) c61Var2.G).n(c61Var2, (lsj) arrayList.get(0)).h();
                }
                return new yqj(Double.valueOf(str8.indexOf(strH, (int) gqk.i(arrayList.size() < 2 ? 0.0d : ((mvd) c61Var2.G).n(c61Var2, (lsj) arrayList.get(1)).a().doubleValue()))));
            default:
                sz6.p("Command not supported");
                return null;
        }
    }

    public final String toString() {
        return ij0.j("\"", this.E, "\"");
    }
}
