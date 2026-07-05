package defpackage;

import androidx.health.platform.client.proto.g;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class kde {
    public static final kde[] j = new kde[0];
    public int a;
    public int b;
    public kde[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public String h;
    public Map i;

    public kde(int i) {
        this.a = i;
    }

    public final void a(StringBuilder sb) {
        String str;
        int i = 0;
        switch (sq6.F(this.a)) {
            case 0:
                sb.append("[^\\x00-\\x{10FFFF}]");
                break;
            case 1:
                sb.append("(?:)");
                break;
            case 2:
                if ((this.b & 1) != 0) {
                    sb.append("(?i:");
                }
                int[] iArr = this.d;
                int length = iArr.length;
                while (i < length) {
                    ghk.h(iArr[i], sb);
                    i++;
                }
                if ((this.b & 1) != 0) {
                    sb.append(')');
                }
                break;
            case 3:
                if (this.d.length % 2 == 0) {
                    sb.append('[');
                    int[] iArr2 = this.d;
                    if (iArr2.length == 0) {
                        sb.append("^\\x00-\\x{10FFFF}");
                    } else if (iArr2[0] == 0 && iArr2[iArr2.length - 1] == 1114111) {
                        sb.append('^');
                        int i2 = 1;
                        while (true) {
                            int[] iArr3 = this.d;
                            if (i2 < iArr3.length - 1) {
                                int i3 = iArr3[i2] + 1;
                                int i4 = iArr3[i2 + 1] - 1;
                                if (i3 == 45) {
                                    sb.append('\\');
                                }
                                ghk.h(i3, sb);
                                if (i3 != i4) {
                                    sb.append('-');
                                    if (i4 == 45) {
                                        sb.append('\\');
                                    }
                                    ghk.h(i4, sb);
                                }
                                i2 += 2;
                            }
                        }
                    } else {
                        while (true) {
                            int[] iArr4 = this.d;
                            if (i < iArr4.length) {
                                int i5 = iArr4[i];
                                int i6 = iArr4[i + 1];
                                if (i5 == 45) {
                                    sb.append('\\');
                                }
                                ghk.h(i5, sb);
                                if (i5 != i6) {
                                    sb.append('-');
                                    if (i6 == 45) {
                                        sb.append('\\');
                                    }
                                    ghk.h(i6, sb);
                                }
                                i += 2;
                            }
                        }
                    }
                    sb.append(']');
                } else {
                    sb.append("[invalid char class]");
                }
                break;
            case 4:
                sb.append("(?-s:.)");
                break;
            case 5:
                sb.append("(?s:.)");
                break;
            case 6:
                sb.append('^');
                break;
            case 7:
                sb.append('$');
                break;
            case 8:
                sb.append("\\A");
                break;
            case 9:
                if ((this.b & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
                    sb.append("\\z");
                } else {
                    sb.append("(?-m:$)");
                }
                break;
            case 10:
                sb.append("\\b");
                break;
            case 11:
                sb.append("\\B");
                break;
            case 12:
                String str2 = this.h;
                if (str2 == null || str2.isEmpty()) {
                    sb.append('(');
                } else {
                    sb.append("(?P<");
                    sb.append(this.h);
                    sb.append(">");
                }
                kde kdeVar = this.c[0];
                if (kdeVar.a != 2) {
                    kdeVar.a(sb);
                }
                sb.append(')');
                break;
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
                kde kdeVar2 = this.c[0];
                if (sq6.F(kdeVar2.a) > 12 || (kdeVar2.a == 3 && kdeVar2.d.length > 1)) {
                    sb.append("(?:");
                    kdeVar2.a(sb);
                    sb.append(')');
                } else {
                    kdeVar2.a(sb);
                }
                switch (sq6.F(this.a)) {
                    case 13:
                        sb.append('*');
                        break;
                    case 14:
                        sb.append('+');
                        break;
                    case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                        sb.append('?');
                        break;
                    case 16:
                        sb.append('{');
                        sb.append(this.e);
                        if (this.e != this.f) {
                            sb.append(',');
                            int i7 = this.f;
                            if (i7 >= 0) {
                                sb.append(i7);
                            }
                        }
                        sb.append('}');
                        break;
                }
                if ((this.b & 32) != 0) {
                    sb.append('?');
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                kde[] kdeVarArr = this.c;
                int length2 = kdeVarArr.length;
                while (i < length2) {
                    kde kdeVar3 = kdeVarArr[i];
                    if (kdeVar3.a == 19) {
                        sb.append("(?:");
                        kdeVar3.a(sb);
                        sb.append(')');
                    } else {
                        kdeVar3.a(sb);
                    }
                    i++;
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                kde[] kdeVarArr2 = this.c;
                int length3 = kdeVarArr2.length;
                String str3 = "";
                while (i < length3) {
                    kde kdeVar4 = kdeVarArr2[i];
                    sb.append(str3);
                    kdeVar4.a(sb);
                    i++;
                    str3 = "|";
                }
                break;
            default:
                switch (this.a) {
                    case 1:
                        str = "NO_MATCH";
                        break;
                    case 2:
                        str = "EMPTY_MATCH";
                        break;
                    case 3:
                        str = "LITERAL";
                        break;
                    case 4:
                        str = "CHAR_CLASS";
                        break;
                    case 5:
                        str = "ANY_CHAR_NOT_NL";
                        break;
                    case 6:
                        str = "ANY_CHAR";
                        break;
                    case 7:
                        str = "BEGIN_LINE";
                        break;
                    case 8:
                        str = "END_LINE";
                        break;
                    case 9:
                        str = "BEGIN_TEXT";
                        break;
                    case 10:
                        str = "END_TEXT";
                        break;
                    case 11:
                        str = "WORD_BOUNDARY";
                        break;
                    case 12:
                        str = "NO_WORD_BOUNDARY";
                        break;
                    case 13:
                        str = "CAPTURE";
                        break;
                    case 14:
                        str = "STAR";
                        break;
                    case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                        str = "PLUS";
                        break;
                    case 16:
                        str = "QUEST";
                        break;
                    case g.MAX_FIELD_NUMBER /* 17 */:
                        str = "REPEAT";
                        break;
                    case g.AVG_FIELD_NUMBER /* 18 */:
                        str = "CONCAT";
                        break;
                    case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        str = "ALTERNATE";
                        break;
                    case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                        str = "LEFT_PAREN";
                        break;
                    case 21:
                        str = "VERTICAL_BAR";
                        break;
                    default:
                        str = "null";
                        break;
                }
                sb.append(str);
                break;
        }
    }

    public final int b() {
        int i = this.a == 13 ? this.g : 0;
        kde[] kdeVarArr = this.c;
        if (kdeVarArr != null) {
            for (kde kdeVar : kdeVarArr) {
                int iB = kdeVar.b();
                if (i < iB) {
                    i = iB;
                }
            }
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kde) {
            kde kdeVar = (kde) obj;
            int i = this.a;
            if (i == kdeVar.a) {
                int iF = sq6.F(i);
                if (iF == 2 || iF == 3) {
                    if (Arrays.equals(this.d, kdeVar.d)) {
                        return true;
                    }
                } else if (iF != 9) {
                    switch (iF) {
                        case 12:
                            if (this.g == kdeVar.g) {
                                String str = this.h;
                                String str2 = kdeVar.h;
                                if (str != null ? str.equals(str2) : str2 == null) {
                                    if (this.c[0].equals(kdeVar.c[0])) {
                                        return true;
                                    }
                                }
                            }
                            break;
                        case 13:
                        case 14:
                        case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                            if ((this.b & 32) == (kdeVar.b & 32) && this.c[0].equals(kdeVar.c[0])) {
                                return true;
                            }
                            break;
                        case 16:
                            if ((this.b & 32) == (kdeVar.b & 32) && this.e == kdeVar.e && this.f == kdeVar.f && this.c[0].equals(kdeVar.c[0])) {
                                return true;
                            }
                            break;
                        case g.MAX_FIELD_NUMBER /* 17 */:
                        case g.AVG_FIELD_NUMBER /* 18 */:
                            if (this.c.length == kdeVar.c.length) {
                                int i2 = 0;
                                while (true) {
                                    kde[] kdeVarArr = this.c;
                                    if (i2 >= kdeVarArr.length) {
                                        return true;
                                    }
                                    if (kdeVarArr[i2].equals(kdeVar.c[i2])) {
                                        i2++;
                                    }
                                }
                            }
                            break;
                        default:
                            return true;
                    }
                } else if ((this.b & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == (kdeVar.b & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iF = sq6.F(this.a);
        int iF2 = sq6.F(this.a);
        if (iF2 == 2 || iF2 == 3) {
            iHashCode = Arrays.hashCode(this.d);
        } else if (iF2 != 9) {
            switch (iF2) {
                case 12:
                    int i = this.g * 31;
                    String str = this.h;
                    iHashCode3 = ((str != null ? str.hashCode() : 0) * 31) + i;
                    iHashCode4 = this.c[0].hashCode();
                    iHashCode2 = (iHashCode4 * 31) + iHashCode3;
                    return iHashCode2 + iF;
                case 13:
                case 14:
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    iHashCode2 = (this.c[0].hashCode() * 31) + ((this.b & 32) * 31);
                    return iHashCode2 + iF;
                case 16:
                    iHashCode3 = (this.f * 31) + (this.e * 31);
                    iHashCode4 = this.c[0].hashCode();
                    iHashCode2 = (iHashCode4 * 31) + iHashCode3;
                    return iHashCode2 + iF;
                case g.MAX_FIELD_NUMBER /* 17 */:
                case g.AVG_FIELD_NUMBER /* 18 */:
                    iHashCode = Arrays.deepHashCode(this.c);
                    break;
                default:
                    return iF;
            }
        } else {
            iHashCode = this.b & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        }
        iHashCode2 = iHashCode * 31;
        return iHashCode2 + iF;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }
}
