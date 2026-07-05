package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class tm8 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ um8 G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ om8 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm8(um8 um8Var, String str, String str2, om8 om8Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = um8Var;
        this.H = str;
        this.I = str2;
        this.J = om8Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new tm8(this.G, this.H, this.I, this.J, tp4Var, 0);
            default:
                return new tm8(this.G, this.H, this.I, this.J, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((tm8) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws JSONException {
        int i = this.E;
        om8 om8Var = this.J;
        int i2 = 0;
        String str = this.I;
        m45 m45Var = m45.E;
        um8 um8Var = this.G;
        String str2 = this.H;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    obj = um8.a(um8Var, str2, str, this);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                String str3 = (String) obj;
                if (str3 == null) {
                    return new SpannableString(str2);
                }
                SpannableString spannableString = new SpannableString(str2);
                if (bsg.I0(str3) || str3.equals("[]")) {
                    return spannableString;
                }
                JSONArray jSONArray = new JSONArray(str3);
                int length = jSONArray.length() / 3;
                while (i2 < length) {
                    int i4 = i2 * 3;
                    int i5 = jSONArray.getInt(i4);
                    int i6 = jSONArray.getInt(i4 + 1);
                    int i7 = jSONArray.getInt(i4 + 2);
                    if (i5 >= 0 && i6 <= str2.length() && i5 < i6) {
                        ish.F.getClass();
                        ish ishVar = (ish) ish.G.get(Integer.valueOf(i7));
                        if (ishVar != null) {
                            spannableString.setSpan(new ForegroundColorSpan(((int[]) om8Var.g)[q54.a[ishVar.E]]), i5, i6, 33);
                        }
                    }
                    i2++;
                }
                return spannableString;
            default:
                int i8 = this.F;
                if (i8 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    obj = um8.a(um8Var, str2, str, this);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i8 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                String str4 = (String) obj;
                if (str4 != null) {
                    return um8.e(bsg.Y0(str2, new String[]{"\n"}, 6), str2, str4, om8Var);
                }
                List listN0 = bsg.N0(str2);
                int size = listN0.size();
                SpannableString[] spannableStringArr = new SpannableString[size];
                while (i2 < size) {
                    spannableStringArr[i2] = new SpannableString((CharSequence) listN0.get(i2));
                    i2++;
                }
                return spannableStringArr;
        }
    }
}
