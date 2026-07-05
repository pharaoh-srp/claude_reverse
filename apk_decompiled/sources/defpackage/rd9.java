package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rd9 {
    public static final sxb a = sxb.e("message");
    public static final sxb b = sxb.e("allowedTargets");
    public static final sxb c = sxb.e(ExperienceToggle.DEFAULT_PARAM_KEY);
    public static final Map d = sta.h0(new cpc(okg.t, mj9.c), new cpc(okg.w, mj9.d), new cpc(okg.x, mj9.f));

    public static z9d a(ww7 ww7Var, sd9 sd9Var, el5 el5Var) {
        zae zaeVarA;
        ww7Var.getClass();
        sd9Var.getClass();
        el5Var.getClass();
        if (ww7Var.equals(okg.m)) {
            ww7 ww7Var2 = mj9.e;
            ww7Var2.getClass();
            zae zaeVarA2 = sd9Var.a(ww7Var2);
            if (zaeVarA2 != null) {
                return new ae9(zaeVarA2, el5Var);
            }
        }
        ww7 ww7Var3 = (ww7) d.get(ww7Var);
        if (ww7Var3 == null || (zaeVarA = sd9Var.a(ww7Var3)) == null) {
            return null;
        }
        return b(el5Var, zaeVarA, false);
    }

    public static z9d b(el5 el5Var, zae zaeVar, boolean z) {
        zaeVar.getClass();
        el5Var.getClass();
        gh3 gh3VarA = yae.a(ez1.I(ez1.H(zaeVar.a)));
        if (gh3VarA.equals(gh3.j(mj9.c))) {
            return new se9(zaeVar, el5Var);
        }
        if (gh3VarA.equals(gh3.j(mj9.d))) {
            return new le9(zaeVar, el5Var);
        }
        if (gh3VarA.equals(gh3.j(mj9.f))) {
            return new qd9(el5Var, zaeVar, okg.x);
        }
        if (gh3VarA.equals(gh3.j(mj9.e))) {
            return null;
        }
        return new rx9(el5Var, zaeVar, z);
    }
}
