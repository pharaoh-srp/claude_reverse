package defpackage;

import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.anthropic.claude.api.memory.MelangeMeta;
import com.anthropic.claude.types.strings.AccountId;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class pa9 implements Comparator {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public pa9(Comparator comparator) {
        this.E = 6;
        this.F = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.E;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                yr9 yr9Var = (yr9) obj;
                bz7 bz7Var = (bz7) obj3;
                yr9Var.getClass();
                String string = bz7Var.invoke(yr9Var).toString();
                yr9 yr9Var2 = (yr9) obj2;
                yr9Var2.getClass();
                return nai.r(string, bz7Var.invoke(yr9Var2).toString());
            case 1:
                Spanned spanned = (Spanned) obj3;
                return Integer.valueOf(spanned.getSpanStart((LeadingMarginSpan) obj)).compareTo(Integer.valueOf(spanned.getSpanStart((LeadingMarginSpan) obj2)));
            case 2:
                int iCompare = ((g67) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : nai.r(((MelangeMeta) obj).getPath(), ((MelangeMeta) obj2).getPath());
            case 3:
                jkc jkcVar = (jkc) obj3;
                return jkcVar.O(((AccountId) obj).m949unboximpl()).compareTo(jkcVar.O(((AccountId) obj2).m949unboximpl()));
            case 4:
                int iCompare2 = ((x8e) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : nai.r(((ar) obj).a, ((ar) obj2).a);
            case 5:
                cvb cvbVar = (cvb) obj3;
                return Integer.valueOf(cvbVar.c(((Number) obj).longValue())).compareTo(Integer.valueOf(cvbVar.c(((Number) obj2).longValue())));
            case 6:
                int iCompare3 = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                return av9.x0.compare(((wjf) obj).c, ((wjf) obj2).c);
            case 7:
                int iCompare4 = ((pa9) obj3).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : Integer.valueOf(((wjf) obj).f).compareTo(Integer.valueOf(((wjf) obj2).f));
            case 8:
                String str = (String) obj3;
                return Integer.valueOf(svj.b(str, (String) obj)).compareTo(Integer.valueOf(svj.b(str, (String) obj2)));
            default:
                int iCompare5 = ((o9g) obj3).compare(obj, obj2);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                Locale locale = Locale.ROOT;
                String lowerCase = ((String) obj).toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((String) obj2).toLowerCase(locale);
                lowerCase2.getClass();
                return lowerCase.compareTo(lowerCase2);
        }
    }

    public /* synthetic */ pa9(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }
}
