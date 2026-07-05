package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.chat.citation.Citation;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.conway.protocol.ConwayExtensionMeta;
import com.anthropic.claude.conway.protocol.ConwayForkMeta;
import com.anthropic.claude.sessions.types.SessionResource;
import com.google.android.gms.common.api.Scope;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class mt7 implements Comparator {
    public static final mt7 F = new mt7(0);
    public static final mt7 G = new mt7(1);
    public static final mt7 H = new mt7(2);
    public static final mt7 I = new mt7(3);
    public static final mt7 J = new mt7(4);
    public static final /* synthetic */ mt7 K = new mt7(5);
    public static final /* synthetic */ mt7 L = new mt7(6);
    public static final /* synthetic */ mt7 M = new mt7(7);
    public final /* synthetic */ int E;

    public /* synthetic */ mt7(int i) {
        this.E = i;
    }

    public static int a(bo5 bo5Var) {
        if (m06.m(bo5Var)) {
            return 8;
        }
        if (bo5Var instanceof dm4) {
            return 7;
        }
        if (bo5Var instanceof hrd) {
            return ((hrd) bo5Var).S() == null ? 6 : 5;
        }
        if (bo5Var instanceof h08) {
            return ((h08) bo5Var).S() == null ? 4 : 3;
        }
        if (bo5Var instanceof qqb) {
            return 2;
        }
        return bo5Var instanceof q16 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.E) {
            case 0:
                jt7 jt7Var = (jt7) obj;
                jt7 jt7Var2 = (jt7) obj2;
                if (!cok.q(jt7Var) || !cok.q(jt7Var2)) {
                    if (cok.q(jt7Var)) {
                        return -1;
                    }
                    return cok.q(jt7Var2) ? 1 : 0;
                }
                av9 av9VarW = yfd.W(jt7Var);
                av9 av9VarW2 = yfd.W(jt7Var2);
                if (x44.r(av9VarW, av9VarW2)) {
                    return 0;
                }
                Object[] objArr = new av9[16];
                int i = 0;
                while (av9VarW != null) {
                    int i2 = i + 1;
                    if (objArr.length < i2) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                    }
                    objArr[0] = av9VarW;
                    i++;
                    av9VarW = av9VarW.G();
                }
                Object[] objArr3 = new av9[16];
                int i3 = 0;
                while (av9VarW2 != null) {
                    int i4 = i3 + 1;
                    if (objArr3.length < i4) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i3 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                    }
                    objArr3[0] = av9VarW2;
                    i3++;
                    av9VarW2 = av9VarW2.G();
                }
                int iMin = Math.min(i - 1, i3 - 1);
                if (iMin >= 0) {
                    int i5 = 0;
                    while (x44.r(objArr[i5], objArr3[i5])) {
                        if (i5 != iMin) {
                            i5++;
                        }
                    }
                    return x44.z(((av9) objArr[i5]).H(), ((av9) objArr3[i5]).H());
                }
                sz6.j("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                l9e l9eVarH = ((wjf) obj).h();
                l9e l9eVarH2 = ((wjf) obj2).h();
                int iCompare = Float.compare(l9eVarH.a, l9eVarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(l9eVarH.b, l9eVarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(l9eVarH.d, l9eVarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(l9eVarH.c, l9eVarH2.c);
            case 2:
                bo5 bo5Var = (bo5) obj;
                bo5 bo5Var2 = (bo5) obj2;
                int iA = a(bo5Var2) - a(bo5Var);
                if (iA != 0) {
                    numValueOf = Integer.valueOf(iA);
                } else if (m06.n(bo5Var, 4) && m06.n(bo5Var2, 4)) {
                    numValueOf = 0;
                } else {
                    int iCompareTo = bo5Var.getName().E.compareTo(bo5Var2.getName().E);
                    numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            case 3:
                l9e l9eVarH3 = ((wjf) obj).h();
                l9e l9eVarH4 = ((wjf) obj2).h();
                int iCompare4 = Float.compare(l9eVarH4.c, l9eVarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(l9eVarH3.b, l9eVarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(l9eVarH3.d, l9eVarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(l9eVarH4.a, l9eVarH3.a);
            case 4:
                cpc cpcVar = (cpc) obj;
                cpc cpcVar2 = (cpc) obj2;
                int iCompare7 = Float.compare(((l9e) cpcVar.E).b, ((l9e) cpcVar2.E).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((l9e) cpcVar.E).d, ((l9e) cpcVar2.E).d);
            case 5:
                return ((Scope) obj).F.compareTo(((Scope) obj2).F);
            case 6:
                jf7 jf7Var = (jf7) obj;
                jf7 jf7Var2 = (jf7) obj2;
                return !jf7Var.E.equals(jf7Var2.E) ? jf7Var.E.compareTo(jf7Var2.E) : (jf7Var.l0() > jf7Var2.l0() ? 1 : (jf7Var.l0() == jf7Var2.l0() ? 0 : -1));
            case 7:
                ((xs9) obj2).getClass();
                ((xs9) obj).getClass();
                return 0;
            case 8:
                return nai.r(((SessionResource) obj2).getUpdated_at(), ((SessionResource) obj).getUpdated_at());
            case 9:
                return Integer.valueOf(((yb0) obj).b).compareTo(Integer.valueOf(((yb0) obj2).b));
            case 10:
                return Integer.valueOf(((yb0) obj).b).compareTo(Integer.valueOf(((yb0) obj2).b));
            case 11:
                return nai.r((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 12:
                return Boolean.valueOf(((k82) obj2).f).compareTo(Boolean.valueOf(((k82) obj).f));
            case 13:
                return Integer.valueOf(((e6i) obj2).c).compareTo(Integer.valueOf(((e6i) obj).c));
            case 14:
                return nai.r(((Citation) obj).getEnd_index(), ((Citation) obj2).getEnd_index());
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return o06.g((qqb) obj).b().compareTo(o06.g((qqb) obj2).b());
            case 16:
                return Integer.valueOf(((n6e) ((cpc) obj).E).ordinal()).compareTo(Integer.valueOf(((n6e) ((cpc) obj2).E).ordinal()));
            case g.MAX_FIELD_NUMBER /* 17 */:
                return nai.r(((SessionResource) obj2).getUpdated_at(), ((SessionResource) obj).getUpdated_at());
            case g.AVG_FIELD_NUMBER /* 18 */:
                return Double.valueOf(((k64) obj).a).compareTo(Double.valueOf(((k64) obj2).a));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String str = ((vg4) w44.L0((List) ((Map.Entry) obj).getValue())).b;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((vg4) w44.L0((List) ((Map.Entry) obj2).getValue())).b.toLowerCase(locale);
                lowerCase2.getClass();
                return lowerCase.compareTo(lowerCase2);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                String title = ((vg4) obj).d.getTitle();
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = title.toLowerCase(locale2);
                lowerCase3.getClass();
                String lowerCase4 = ((vg4) obj2).d.getTitle().toLowerCase(locale2);
                lowerCase4.getClass();
                return lowerCase3.compareTo(lowerCase4);
            case 21:
                return Integer.valueOf(((String) obj2).length()).compareTo(Integer.valueOf(((String) obj).length()));
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return nai.r(((ChatConversationWithProjectReference) obj2).getUpdated_at(), ((ChatConversationWithProjectReference) obj).getUpdated_at());
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return nai.r(((ConwayExtensionMeta) obj).getName(), ((ConwayExtensionMeta) obj2).getName());
            case 24:
                return Long.valueOf(((ConwayForkMeta) obj).getCreatedAt()).compareTo(Long.valueOf(((ConwayForkMeta) obj2).getCreatedAt()));
            case BuildConfig.VERSION_CODE /* 25 */:
                return nai.r((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 26:
                return Long.valueOf(((mpg) obj).b).compareTo(Long.valueOf(((mpg) obj2).b));
            case 27:
                return Long.valueOf(((mpg) obj).b).compareTo(Long.valueOf(((mpg) obj2).b));
            case 28:
                return Long.valueOf(((Project) obj2).getUpdated_at().getTime()).compareTo(Long.valueOf(((Project) obj).getUpdated_at().getTime()));
            default:
                return nai.r(((File) obj2).getName(), ((File) obj).getName());
        }
    }
}
