package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
import com.anthropic.claude.R;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.api.errors.ClaudeApiError$AuthError;
import com.anthropic.claude.api.errors.ClaudeApiError$CloudflareChallengeError;
import com.anthropic.claude.api.errors.ClaudeApiError$CloudflareWaitingRoomError;
import com.anthropic.claude.api.errors.ClaudeApiError$InvalidRequestError;
import com.anthropic.claude.api.errors.ClaudeApiError$OtherApiError;
import com.anthropic.claude.api.errors.ClaudeApiError$OverloadedApiError;
import com.anthropic.claude.api.errors.ClaudeApiError$RateLimitApiError;
import com.anthropic.claude.api.errors.ClaudeApiError$ServerError;
import com.anthropic.claude.api.errors.ClaudeApiError$UnknownPermissionError;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class nt6 implements vt6 {
    public final bj3 a;

    public nt6(bj3 bj3Var) {
        bj3Var.getClass();
        this.a = bj3Var;
    }

    @Override // defpackage.vt6
    public final zb0 a(ld4 ld4Var) {
        int i;
        zb0 zb0VarF;
        int i2;
        int i3;
        String strN;
        int i4;
        int i5;
        int i6;
        int i7;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-503068175);
        bj3 bj3Var = this.a;
        bj3Var.getClass();
        e18Var.a0(126490749);
        if (!rkk.i(bj3Var)) {
            e18Var.a0(1599924133);
            e18Var.p(false);
            boolean z = bj3Var instanceof ClaudeApiError$AuthError;
            lz1 lz1Var = jd4.a;
            if (z) {
                e18Var.a0(1298538709);
                ClaudeApiError$AuthError claudeApiError$AuthError = (ClaudeApiError$AuthError) bj3Var;
                String str = claudeApiError$AuthError.b;
                if (str == null) {
                    e18Var.a0(308873403);
                    switch (claudeApiError$AuthError.a.ordinal()) {
                        case 0:
                            zb0VarF = qy1.f(e18Var, 1710885196, R.string.error_unknown, e18Var, false);
                            e18Var.p(false);
                            break;
                        case 1:
                            i6 = 1710828469;
                            i7 = R.string.error_signups_disabled;
                            zb0VarF = qy1.f(e18Var, i6, i7, e18Var, false);
                            e18Var.p(false);
                            break;
                        case 2:
                            i6 = 1710832211;
                            i7 = R.string.error_region_missing;
                            zb0VarF = qy1.f(e18Var, i6, i7, e18Var, false);
                            e18Var.p(false);
                            break;
                        case 3:
                            i6 = 1710836287;
                            i7 = R.string.error_signups_disabled_in_region;
                            zb0VarF = qy1.f(e18Var, i6, i7, e18Var, false);
                            e18Var.p(false);
                            break;
                        case 4:
                            i6 = 1710840768;
                            i7 = R.string.error_signin_temporarily_disabled;
                            zb0VarF = qy1.f(e18Var, i6, i7, e18Var, false);
                            e18Var.p(false);
                            break;
                        case 5:
                            i6 = 1710848855;
                            i7 = R.string.error_no_console_account;
                            zb0VarF = qy1.f(e18Var, i6, i7, e18Var, false);
                            e18Var.p(false);
                            break;
                        case 6:
                            i6 = 1710844950;
                            i7 = R.string.error_invalid_recaptcha;
                            zb0VarF = qy1.f(e18Var, i6, i7, e18Var, false);
                            e18Var.p(false);
                            break;
                        case 7:
                            i6 = 1710853055;
                            i7 = R.string.error_account_needs_verification;
                            zb0VarF = qy1.f(e18Var, i6, i7, e18Var, false);
                            e18Var.p(false);
                            break;
                        case 8:
                            e18Var.a0(1710857476);
                            zb0VarF = zrk.j(R.string.error_account_banned, x44.X("https://www.anthropic.com/legal/consumer-terms", "https://claude.ai/legal/aup", tyg.TRUST_AND_SAFETY_APPEALS.a()), null, new CharSequence[0], e18Var, 0, 4);
                            e18Var.p(false);
                            e18Var.p(false);
                            break;
                        case 9:
                            i6 = 1710872826;
                            i7 = R.string.error_invalid_authorization;
                            zb0VarF = qy1.f(e18Var, i6, i7, e18Var, false);
                            e18Var.p(false);
                            break;
                        case 10:
                            i6 = 1710877020;
                            i7 = R.string.error_account_session_invalid;
                            zb0VarF = qy1.f(e18Var, i6, i7, e18Var, false);
                            e18Var.p(false);
                            break;
                        case 11:
                            i6 = 1710881144;
                            i7 = R.string.error_email_auth_disabled;
                            zb0VarF = qy1.f(e18Var, i6, i7, e18Var, false);
                            e18Var.p(false);
                            break;
                        default:
                            throw ebh.u(e18Var, 1710827910, false);
                    }
                } else {
                    e18Var.a0(985184334);
                    StringBuilder sb = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    Configuration configuration = (Configuration) e18Var.j(w00.a);
                    boolean zF = e18Var.f(configuration);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        LocaleList locales = configuration.getLocales();
                        locales.getClass();
                        objN = (Locale) w44.L0(mpk.f0(locales));
                        e18Var.k0(objN);
                    }
                    sb.append(mpk.s(str, (Locale) objN));
                    String string = sb.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        arrayList2.add(((wb0) arrayList.get(i8)).a(sb.length()));
                    }
                    zb0VarF = new zb0(string, (List) arrayList2);
                    e18Var.p(false);
                }
                e18Var.p(false);
            } else if (bj3Var instanceof ClaudeApiError$InvalidRequestError) {
                e18Var.a0(1298541237);
                ClaudeApiError$InvalidRequestError claudeApiError$InvalidRequestError = (ClaudeApiError$InvalidRequestError) bj3Var;
                String str2 = claudeApiError$InvalidRequestError.b;
                yi3 yi3Var = claudeApiError$InvalidRequestError.a;
                if (yi3Var != yi3.I) {
                    e18Var.a0(-792929877);
                    zb0VarF = ju6.a(yi3Var, e18Var);
                    e18Var.p(false);
                } else if (str2 != null) {
                    e18Var.a0(1189035902);
                    StringBuilder sb2 = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    Configuration configuration2 = (Configuration) e18Var.j(w00.a);
                    boolean zF2 = e18Var.f(configuration2);
                    Object objN2 = e18Var.N();
                    if (zF2 || objN2 == lz1Var) {
                        LocaleList locales2 = configuration2.getLocales();
                        locales2.getClass();
                        objN2 = (Locale) w44.L0(mpk.f0(locales2));
                        e18Var.k0(objN2);
                    }
                    sb2.append(mpk.s(str2, (Locale) objN2));
                    String string2 = sb2.toString();
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    int size2 = arrayList3.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        arrayList4.add(((wb0) arrayList3.get(i9)).a(sb2.length()));
                    }
                    zb0VarF = new zb0(string2, (List) arrayList4);
                    e18Var.p(false);
                } else {
                    e18Var.a0(-792923765);
                    zb0VarF = ju6.a(yi3Var, e18Var);
                    e18Var.p(false);
                }
                e18Var.p(false);
            } else if (bj3Var instanceof ClaudeApiError$OtherApiError) {
                e18Var.a0(1298543573);
                ClaudeApiError$OtherApiError claudeApiError$OtherApiError = (ClaudeApiError$OtherApiError) bj3Var;
                e18Var.a0(371623141);
                xb0 xb0Var = new xb0();
                String str3 = claudeApiError$OtherApiError.a;
                String str4 = claudeApiError$OtherApiError.b;
                if (str3 == null || !bsg.u0(str4, " ", false) || bsg.u0(str4, "_", false)) {
                    e18Var.a0(-1059070138);
                    xb0Var.h(d4c.j0(R.string.error_unknown, e18Var));
                    e18Var.p(false);
                } else {
                    e18Var.a0(-1059318107);
                    e18Var.p(false);
                    xb0Var.g(str4);
                }
                zb0VarF = xb0Var.n();
                e18Var.p(false);
                e18Var.p(false);
            } else if (bj3Var instanceof ClaudeApiError$RateLimitApiError) {
                e18Var.a0(1298546037);
                ClaudeApiError$RateLimitApiError claudeApiError$RateLimitApiError = (ClaudeApiError$RateLimitApiError) bj3Var;
                RateLimit rateLimit = claudeApiError$RateLimitApiError.b;
                e18Var.a0(-2098518348);
                StringBuilder sb3 = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                new ArrayList();
                if ((rateLimit instanceof RateLimit.WithinLimit) || (rateLimit instanceof RateLimit.ApproachingLimit)) {
                    strN = vb7.n(e18Var, 206008426, R.string.error_rate_limit, e18Var, false);
                } else if (rateLimit instanceof RateLimit.ExceedsLimit) {
                    e18Var.a0(2091386137);
                    if (x44.r(((RateLimit.ExceedsLimit) rateLimit).getPerModelLimit(), Boolean.TRUE)) {
                        i4 = 2091506758;
                        i5 = R.string.error_rate_limit_per_model;
                    } else {
                        i4 = 2091602889;
                        i5 = R.string.error_rate_limit_global;
                    }
                    strN = vb7.n(e18Var, i4, i5, e18Var, false);
                    e18Var.p(false);
                } else {
                    if (rateLimit != null) {
                        throw ebh.u(e18Var, 206004836, false);
                    }
                    e18Var.a0(2091740653);
                    strN = claudeApiError$RateLimitApiError.a;
                    if (strN == null) {
                        strN = vb7.n(e18Var, 206023178, R.string.error_rate_limit, e18Var, false);
                    } else {
                        e18Var.a0(206022837);
                        e18Var.p(false);
                    }
                    e18Var.p(false);
                }
                sb3.append(strN);
                String string3 = sb3.toString();
                ArrayList arrayList6 = new ArrayList(arrayList5.size());
                int size3 = arrayList5.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    arrayList6.add(((wb0) arrayList5.get(i10)).a(sb3.length()));
                }
                zb0 zb0Var = new zb0(string3, (List) arrayList6);
                e18Var.p(false);
                e18Var.p(false);
                zb0VarF = zb0Var;
            } else if (bj3Var instanceof ClaudeApiError$ServerError) {
                e18Var.a0(1298548309);
                ClaudeApiError$ServerError claudeApiError$ServerError = (ClaudeApiError$ServerError) bj3Var;
                e18Var.a0(295726111);
                xb0 xb0Var2 = new xb0();
                String str5 = claudeApiError$ServerError.a;
                String str6 = claudeApiError$ServerError.b;
                if (str5 == null || str6 == null || !bsg.u0(str6, " ", false) || bsg.u0(str6, "_", false)) {
                    e18Var.a0(2119825408);
                    xb0Var2.h(d4c.j0(R.string.error_server, e18Var));
                    e18Var.p(false);
                } else {
                    e18Var.a0(2119779838);
                    e18Var.p(false);
                    xb0Var2.g(str6);
                }
                zb0VarF = xb0Var2.n();
                e18Var.p(false);
                e18Var.p(false);
            } else if (bj3Var instanceof ClaudeApiError$OverloadedApiError) {
                i2 = 1298550805;
                i3 = R.string.error_overloaded;
            } else if (bj3Var instanceof ClaudeApiError$CloudflareWaitingRoomError) {
                i2 = 1298553557;
                i3 = R.string.error_planned_maintenance;
            } else {
                if (bj3Var instanceof ClaudeApiError$CloudflareChallengeError) {
                    i = 1298556108;
                } else {
                    if (!(bj3Var instanceof ClaudeApiError$UnknownPermissionError)) {
                        throw ebh.u(e18Var, 1298537565, false);
                    }
                    i = 1298559445;
                }
                zb0VarF = qy1.f(e18Var, i, R.string.error_unknown, e18Var, false);
            }
            e18Var.p(false);
            e18Var.p(false);
            return zb0VarF;
        }
        i2 = 1599862629;
        i3 = R.string.error_conversation_busy;
        zb0VarF = qy1.f(e18Var, i2, i3, e18Var, false);
        e18Var.p(false);
        e18Var.p(false);
        return zb0VarF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt6) && x44.r(this.a, ((nt6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ApiError(apiError=" + this.a + ")";
    }
}
