package defpackage;

import android.content.Context;
import android.net.Uri;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsBlockingPoint;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsUserBlocked;
import com.anthropic.claude.analytics.events.LoginEvents$EmailLoginSSOInitiated;
import com.anthropic.claude.analytics.events.LoginEvents$ManagedLoginBlocked;
import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.login.CodeConfiguration;
import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.login.MagicLinkSentConfig;
import com.anthropic.claude.types.strings.EmailAddress;
import com.anthropic.claude.ui.components.error.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m9j extends iwe {
    public final String b;
    public final tga c;
    public final fja d;
    public final mn5 e;
    public final fk0 f;
    public final qi3 g;
    public final id h;
    public final m26 i;
    public final q79 j;
    public final hj k;
    public final zpa l;
    public final hl8 m;
    public final zy1 n;
    public final zy1 o;
    public final lsc p;
    public final lsc q;
    public final wz5 r;
    public final wz5 s;
    public final lsc t;
    public final lsc u;
    public final lsc v;

    public m9j(String str, tga tgaVar, fja fjaVar, mn5 mn5Var, fk0 fk0Var, qi3 qi3Var, id idVar, m26 m26Var, q79 q79Var, hj hjVar, zpa zpaVar, hl8 hl8Var, h86 h86Var) {
        super(h86Var);
        this.b = str;
        this.c = tgaVar;
        this.d = fjaVar;
        this.e = mn5Var;
        this.f = fk0Var;
        this.g = qi3Var;
        this.h = idVar;
        this.i = m26Var;
        this.j = q79Var;
        this.k = hjVar;
        this.l = zpaVar;
        this.m = hl8Var;
        this.n = x44.a();
        this.o = x44.a();
        Boolean bool = Boolean.FALSE;
        this.p = mpk.P(bool);
        this.q = mpk.P(bool);
        this.r = mpk.w(new ta0(this, 1));
        this.s = mpk.w(new ta0(this, 2));
        this.t = mpk.P(EmailAddress.m1006boximpl(EmailAddress.m1007constructorimpl("")));
        this.u = mpk.P(bool);
        this.v = mpk.P(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.m9j r28, defpackage.u38 r29, defpackage.jj r30, defpackage.vp4 r31) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9j.O(m9j, u38, jj, vp4):java.lang.Object");
    }

    public static final Object P(m9j m9jVar, VerifyResponse verifyResponse, jj jjVar, String str, zy7 zy7Var, vp4 vp4Var) {
        Account account;
        qi3 qi3Var = m9jVar.g;
        zy1 zy1Var = m9jVar.o;
        zy1 zy1Var2 = m9jVar.n;
        hl8 hl8Var = m9jVar.m;
        String sso_url = verifyResponse.getSso_url();
        m45 m45Var = m45.E;
        zme zmeVar = zme.a;
        iei ieiVar = iei.a;
        if (sso_url == null) {
            VerifyResponse.AuthenticationState state = verifyResponse.getState();
            if (state == null) {
                account = verifyResponse.getAccount();
            } else if (state instanceof VerifyResponse.AuthenticationState.Authenticated) {
                account = ((VerifyResponse.AuthenticationState.Authenticated) state).getAccount();
            } else {
                if (!(state instanceof VerifyResponse.AuthenticationState.MagicLink)) {
                    mr9.b();
                    return null;
                }
                if (!m9jVar.l.a()) {
                    bik.g(hl8Var, str, new yme("client_error", "managed_config_magic_link_disabled"));
                    qi3Var.e(new LoginEvents$ManagedLoginBlocked("magic_link"), LoginEvents$ManagedLoginBlocked.Companion.serializer());
                    zy1Var.r(new ut6(R.string.login_managed_email_not_allowed));
                    return ieiVar;
                }
                bik.g(hl8Var, str, zmeVar);
                m9jVar.f.r(true);
                VerifyResponse.AuthenticationState.MagicLink magicLink = (VerifyResponse.AuthenticationState.MagicLink) state;
                CodeConfiguration fallback_code_configuration = magicLink.getFallback_code_configuration();
                Object objB = zy1Var2.b(vp4Var, new n9j(new MagicLinkSentConfig(magicLink.m326getEmailZiuLfiY(), fallback_code_configuration != null ? fallback_code_configuration.getLength() : null, fallback_code_configuration != null ? fallback_code_configuration.getCharset() : null, fallback_code_configuration != null ? fallback_code_configuration.getShow_input_after_delay() : null, null)));
                if (objB == m45Var) {
                    return objB;
                }
            }
            if (account == null) {
                bik.g(hl8Var, str, new yme("client_error", "verify_response_no_account"));
                SilentException.a(new SilentException("VerifyResponse Error: Cannot find account"), null, false, 3);
                zy1Var.r(new tt6());
                return ieiVar;
            }
            m9jVar.d.a(account);
            String strM116getUuidXjkXN6I = qoi.a(account).m116getUuidXjkXN6I();
            qi3Var.d(account.m106getUuidislZJdo(), strM116getUuidXjkXN6I, account.m105getEmail_addressZiuLfiY(), null);
            zy7Var.a();
            bik.g(hl8Var, str, ane.a);
            if (x44.r(verifyResponse.getCreated(), Boolean.TRUE)) {
                bik.h(hl8Var, str);
            }
            return zy1Var2.b(vp4Var, new r9j(account.m106getUuidislZJdo(), strM116getUuidXjkXN6I, jjVar));
        }
        bik.g(hl8Var, str, zmeVar);
        Object objB2 = zy1Var2.b(vp4Var, new o9j(((EmailAddress) m9jVar.t.getValue()).m1013unboximpl(), sso_url));
        if (objB2 == m45Var) {
            return objB2;
        }
        return ieiVar;
    }

    public static final void Q(m9j m9jVar, boolean z) {
        m9jVar.p.setValue(Boolean.valueOf(z));
    }

    public static final void R(m9j m9jVar, AgeSignalsEvents$AgeSignalsBlockingPoint ageSignalsEvents$AgeSignalsBlockingPoint) {
        qi3 qi3Var = m9jVar.g;
        m9jVar.k.getClass();
        qi3Var.e(new AgeSignalsEvents$AgeSignalsUserBlocked(ageSignalsEvents$AgeSignalsBlockingPoint, false), AgeSignalsEvents$AgeSignalsUserBlocked.Companion.serializer());
    }

    public final void S(long j, Context context, String str) {
        str.getClass();
        context.getClass();
        this.g.e(new LoginEvents$EmailLoginSSOInitiated(), LoginEvents$EmailLoginSSOInitiated.Companion.serializer());
        try {
            fd9.t(context, j).u(context, Uri.parse(str));
        } catch (Exception e) {
            List list = xah.a;
            xah.f(e, "Exception opening a custom tab.", null, null, 28);
            a.a(new ut6(R.string.login_sso_custom_tabs_exception), this.o);
        }
    }

    public final void T() {
        String strM1007constructorimpl = EmailAddress.m1007constructorimpl(bsg.k1(((EmailAddress) this.t.getValue()).m1013unboximpl()).toString());
        if (EmailAddress.m1011isStrictlyValidimpl(strM1007constructorimpl)) {
            gb9.D(this.a, null, null, new l9j(this, strM1007constructorimpl, null), 3);
        } else {
            this.o.r(new ut6(R.string.login_welcome_email_error_invalid_email));
        }
    }
}
