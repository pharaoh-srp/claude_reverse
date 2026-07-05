package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.LoginEvents$LoginClientErrorKind;
import com.anthropic.claude.api.errors.ClaudeApiError$CloudflareChallengeError;
import com.anthropic.claude.api.errors.ClaudeApiError$CloudflareWaitingRoomError;
import com.anthropic.claude.api.errors.ClaudeApiError$UnknownPermissionError;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderMalfunctionError;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zhk {
    public static final ta4 a = new ta4(374556006, false, new ya4(9));
    public static final xb b = new xb(11);
    public static final xb c = new xb(13);
    public static final xb d = new xb(12);

    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(401073398);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | 384;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e0g e0gVar = gm3.b(e18Var).k;
            long j = gm3.a(e18Var).p;
            long j2 = gm3.a(e18Var).M;
            qu1 qu1VarA = sf5.a(0.5f, gm3.a(e18Var).u);
            mo8 mo8Var = z79.a;
            pzg.c(zy7Var, b.g(pkb.E, 32.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), false, e0gVar, j, j2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, qu1VarA, null, fd9.q0(-2118730111, new rq(str, 8), e18Var), e18Var, (i2 >> 3) & 14, 708);
            iqbVar2 = fqb.E;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uf2(str, zy7Var, iqbVar2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.vt6 r16, defpackage.zy7 r17, defpackage.iqb r18, defpackage.ld4 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhk.b(vt6, zy7, iqb, ld4, int):void");
    }

    public static final void c(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1593294825);
        int i2 = 4;
        int i3 = (e18Var.h(zy7Var) ? 4 : 2) | i | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            zy7Var2 = zy7Var;
            ez1.e(zy7Var2, fqbVar, false, null, null, qwj.a, e18Var, (i3 & 14) | 1572912, 60);
            iqbVar = fqbVar;
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var2, iqbVar, i, i2);
        }
    }

    public static final void d(Integer num, zb0 zb0Var, iqb iqbVar, ld4 ld4Var, int i, int i2) {
        iqb iqbVar2;
        int i3;
        e18 e18Var;
        iqb iqbVar3;
        int i4;
        iqb iqbVar4;
        boolean z;
        e18 e18Var2;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(1973623498);
        int i5 = i | (e18Var3.f(num) ? 4 : 2) | (e18Var3.f(zb0Var) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i3 = i5 | (e18Var3.f(iqbVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        }
        if (e18Var3.Q(i3 & 1, (i3 & 147) != 146)) {
            iqb iqbVar5 = i6 != 0 ? fqb.E : iqbVar2;
            q64 q64VarA = p64.a(new ho0(4.0f, true, new sz6(1)), lja.S, e18Var3, 6);
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVar5);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, cd4.f, q64VarA);
            d4c.i0(e18Var3, cd4.e, hycVarL);
            d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var3, cd4.h);
            d4c.i0(e18Var3, cd4.d, iqbVarE);
            if (num != null) {
                e18Var3.a0(1105130930);
                iqbVar4 = iqbVar5;
                i4 = i3;
                z = true;
                tjh.b(d4c.j0(num.intValue(), e18Var3), null, gm3.a(e18Var3).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).j, e18Var3, 0, 0, 131066);
                e18Var2 = e18Var3;
                e18Var2.p(false);
            } else {
                i4 = i3;
                iqbVar4 = iqbVar5;
                z = true;
                e18Var2 = e18Var3;
                e18Var2.a0(1105321518);
                e18Var2.p(false);
            }
            e18 e18Var4 = e18Var2;
            tjh.c(zb0Var, null, gm3.a(e18Var2).M, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var4, (i4 >> 3) & 14, 0, 262138);
            e18Var = e18Var4;
            e18Var.p(z);
            iqbVar3 = iqbVar4;
        } else {
            e18Var = e18Var3;
            e18Var.T();
            iqbVar3 = iqbVar2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(num, zb0Var, iqbVar3, i, i2);
        }
    }

    public static final void e(int i, int i2, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        zy7Var.getClass();
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1818995091);
        int i3 = 2;
        int i4 = i2 | (e18Var.d(i) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        byte b2 = 0;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            x2k.e(zy7Var, iqbVar, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(-930611019, new lp1(str, i, i3, b2), e18Var), e18Var, ((i4 >> 3) & 14) | 100663296 | ((i4 >> 6) & 112), 252);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bk1(i, zy7Var, str, iqbVar, i2);
        }
    }

    public static ys6 f(qh9 qh9Var) {
        try {
            return new ys6(qh9Var.s("duration").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Freeze", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Freeze", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Freeze", e3);
            return null;
        }
    }

    public static bxi g(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("replay_level").m();
            strM.getClass();
            for (int i : sq6.H(3)) {
                if (fsh.l(i).equals(strM)) {
                    return new bxi(i);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Privacy", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Privacy", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Privacy", e3);
            return null;
        }
    }

    public static final Integer h(nf0 nf0Var) {
        lf0 lf0Var = nf0Var instanceof lf0 ? (lf0) nf0Var : null;
        if (lf0Var != null) {
            return Integer.valueOf(lf0Var.a);
        }
        return null;
    }

    public static final LoginEvents$LoginClientErrorKind i(nf0 nf0Var) {
        if (!(nf0Var instanceof lf0)) {
            if (nf0Var instanceof mf0) {
                return ((mf0) nf0Var).a instanceof IOException ? LoginEvents$LoginClientErrorKind.NETWORK : LoginEvents$LoginClientErrorKind.CLIENT_EXCEPTION;
            }
            wg6.i();
            return null;
        }
        bj3 bj3Var = ((lf0) nf0Var).b;
        if ((bj3Var instanceof ClaudeApiError$CloudflareChallengeError) || (bj3Var instanceof ClaudeApiError$CloudflareWaitingRoomError) || (bj3Var instanceof ClaudeApiError$UnknownPermissionError)) {
            return LoginEvents$LoginClientErrorKind.CLOUDFLARE_BLOCKED;
        }
        return null;
    }

    public static final LoginEvents$LoginClientErrorKind j(GetCredentialException getCredentialException) {
        return getCredentialException instanceof NoCredentialException ? LoginEvents$LoginClientErrorKind.CREDENTIAL_NO_ACCOUNT : getCredentialException instanceof GetCredentialInterruptedException ? LoginEvents$LoginClientErrorKind.CREDENTIAL_INTERRUPTED : ((getCredentialException instanceof GetCredentialProviderConfigurationException) || (getCredentialException instanceof GetCredentialUnsupportedException)) ? LoginEvents$LoginClientErrorKind.CREDENTIAL_PROVIDER_ERROR : getCredentialException instanceof GetCredentialUnknownException ? LoginEvents$LoginClientErrorKind.CREDENTIAL_UNKNOWN : LoginEvents$LoginClientErrorKind.CREDENTIAL_UNKNOWN;
    }

    public static final String k(nf0 nf0Var) {
        lf0 lf0Var = nf0Var instanceof lf0 ? (lf0) nf0Var : null;
        if (lf0Var != null) {
            return lf0Var.b.getF();
        }
        return null;
    }

    public static final String l(nf0 nf0Var) {
        lf0 lf0Var = nf0Var instanceof lf0 ? (lf0) nf0Var : null;
        if (lf0Var != null) {
            return lf0Var.b.getC();
        }
        return null;
    }

    public static final cpc m(String str, h99 h99Var) {
        uxe uxeVar = uxe.f0;
        g99 g99Var = g99.F;
        CharsetEncoder charsetEncoderNewEncoder = StandardCharsets.UTF_8.newEncoder();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(30720);
        CharBuffer charBufferWrap = CharBuffer.wrap(str);
        try {
            charsetEncoderNewEncoder.encode(charBufferWrap, byteBufferAllocate, true);
            return new cpc(str.substring(0, charBufferWrap.position()), Integer.valueOf(byteBufferAllocate.position()));
        } catch (IllegalStateException e) {
            if (h99Var != null) {
                dch.H(h99Var, 5, g99Var, uxeVar, e, false, 48);
            }
            return new cpc("", 0);
        } catch (NullPointerException e2) {
            if (h99Var != null) {
                dch.H(h99Var, 5, g99Var, uxeVar, e2, false, 48);
            }
            return new cpc("", 0);
        } catch (CoderMalfunctionError e3) {
            if (h99Var != null) {
                dch.H(h99Var, 5, g99Var, uxeVar, e3, false, 48);
            }
            return new cpc("", 0);
        }
    }
}
