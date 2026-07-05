package defpackage;

import android.graphics.RectF;
import android.util.Base64;
import androidx.compose.foundation.layout.b;
import androidx.media3.common.ParserException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.api.chat.ChatConversationWithNestedMessage;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.chat.MessageImageFile;
import com.anthropic.claude.api.chat.MessageUnknownFile;
import com.anthropic.claude.api.chat.ProjectReference;
import com.anthropic.claude.login.MagicLinkIntentData;
import com.pvporbit.freetype.FreeTypeConstants;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nkk {
    public static final ta4 a = new ta4(955342822, false, new rb4(0));
    public static final ta4 b = new ta4(-1138535128, false, new rb4(1));

    public static final void a(MagicLinkIntentData magicLinkIntentData, rz7 rz7Var, zy7 zy7Var, ybg ybgVar, iqb iqbVar, bpa bpaVar, mnc mncVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        bpa bpaVar2;
        int i3;
        magicLinkIntentData.getClass();
        rz7Var.getClass();
        zy7Var.getClass();
        ybgVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1075856458);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(magicLinkIntentData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(rz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(ybgVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.f(mncVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if (e18Var2.Q(i2 & 1, (599187 & i2) != 599186)) {
            e18Var2.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var2.A()) {
                m7f m7fVarB = gr9.b(e18Var2);
                boolean zH = e18Var2.h(m7fVarB);
                Object objN = e18Var2.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVarB, 18);
                    e18Var2.k0(objN);
                }
                kce kceVar = jce.a;
                bpa bpaVar3 = (bpa) fd9.r0(kceVar.b(bpa.class), oq5.B(kceVar.b(bpa.class)), (bz7) objN, e18Var2);
                i3 = i2 & (-458753);
                bpaVar2 = bpaVar3;
            } else {
                e18Var2.T();
                i3 = i2 & (-458753);
                bpaVar2 = bpaVar;
            }
            e18Var2.q();
            zy1 zy1Var = bpaVar2.j;
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objN2 = e18Var2.N();
            tp4 tp4Var = null;
            if (z || objN2 == lz1Var) {
                objN2 = new toa(rz7Var, zy7Var, tp4Var, 1);
                e18Var2.k0(objN2);
            }
            x44.b(zy1Var, (pz7) objN2, e18Var2, 0);
            zni.g(bpaVar2.k, ybgVar, e18Var2, (i3 >> 6) & 112);
            vo1 vo1Var = lja.T;
            iqb iqbVarL = gb9.L(gb9.I(mpk.b0(iqbVar, mpk.Y(e18Var2), true), mncVar), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            boolean zF = e18Var2.f(bpaVar2) | ((i3 & 14) == 4);
            Object objN3 = e18Var2.N();
            if (zF || objN3 == lz1Var) {
                objN3 = new u73(bpaVar2, magicLinkIntentData, null, 25);
                e18Var2.k0(objN3);
            }
            fd9.i(e18Var2, (pz7) objN3, magicLinkIntentData);
            fqb fqbVar = fqb.E;
            tjh.b(gid.p(52.0f, R.string.login_magic_link_verifying_secure_link, e18Var2, e18Var2, fqbVar), null, 0L, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).h, e18Var2, 0, 0, 130046);
            kxk.g(e18Var2, b.e(fqbVar, 16.0f));
            vt6 vt6Var = (vt6) bpaVar2.l.getValue();
            wd6.H(s64.a, vt6Var != null, null, null, null, null, fd9.q0(-758487000, new xg4(vt6Var, bpaVar2, magicLinkIntentData, 21), e18Var2), e18Var2, 1572870, 30);
            e18Var = e18Var2;
            if (vt6Var == null) {
                e18Var.a0(176195911);
                tjd.a(b.o(gb9.J(fqbVar, 12.0f), q02.f), 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 0, 62);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(176375618);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            bpaVar2 = bpaVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yu(magicLinkIntentData, rz7Var, zy7Var, ybgVar, iqbVar, bpaVar2, mncVar, i);
        }
    }

    public static t9i b(boolean z, ds9 ds9Var, int i) {
        pyk pykVar = pyk.U;
        if ((i & 8) != 0) {
            ds9Var = ds9.a;
        }
        return new t9i(z, true, pykVar, ds9Var, es9.a);
    }

    public static kbh c(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            strM.getClass();
            return new kbh(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Application", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Application", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Application", e3);
            return null;
        }
    }

    public static final MessageImageAsset d(MessageFile messageFile) {
        messageFile.getClass();
        if (messageFile instanceof MessageImageFile) {
            MessageImageFile messageImageFile = (MessageImageFile) messageFile;
            MessageImageAsset preview_asset = messageImageFile.getPreview_asset();
            return preview_asset == null ? messageImageFile.getThumbnail_asset() : preview_asset;
        }
        if (messageFile instanceof MessageDocumentFile) {
            return ((MessageDocumentFile) messageFile).getThumbnail_asset();
        }
        if ((messageFile instanceof MessageBlobFile) || (messageFile instanceof MessageUnknownFile)) {
            return null;
        }
        wg6.i();
        return null;
    }

    public static final float e(RectF rectF, boolean z) {
        rectF.getClass();
        return z ? rectF.left : rectF.right;
    }

    public static gjb f(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = tpi.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                ysj.u("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(r2d.d(new ssc(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    ysj.v("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new u5j(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new gjb(arrayList);
    }

    public static fnf g(ssc sscVar, boolean z, boolean z2) throws ParserException {
        if (z) {
            m(3, sscVar, false);
        }
        sscVar.x((int) sscVar.q(), StandardCharsets.UTF_8);
        long jQ = sscVar.q();
        String[] strArr = new String[(int) jQ];
        for (int i = 0; i < jQ; i++) {
            strArr[i] = sscVar.x((int) sscVar.q(), StandardCharsets.UTF_8);
        }
        if (z2 && (sscVar.z() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new fnf(11, strArr);
    }

    public static final void h(RectF rectF, float f) {
        if (f % 180.0f == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        if (f % 90.0f == MTTypesetterKt.kLineSkipLimitMultiplier) {
            if (rectF.width() == rectF.height()) {
                return;
            }
            i(rectF, Float.valueOf(rectF.centerX() - (rectF.height() / 2.0f)), Float.valueOf(rectF.centerY() - (rectF.width() / 2.0f)), Float.valueOf((rectF.height() / 2.0f) + rectF.centerX()), Float.valueOf((rectF.width() / 2.0f) + rectF.centerY()));
            return;
        }
        double radians = Math.toRadians(f);
        double dSin = Math.sin(radians);
        double dCos = Math.cos(radians);
        double dAbs = (Math.abs(((double) rectF.height()) * dSin) + Math.abs(((double) rectF.width()) * dCos)) / 2.0d;
        double dAbs2 = (Math.abs(((double) rectF.height()) * dCos) + Math.abs(((double) rectF.width()) * dSin)) / 2.0d;
        i(rectF, Double.valueOf(((double) rectF.centerX()) - dAbs), Double.valueOf(((double) rectF.centerY()) - dAbs2), Double.valueOf(((double) rectF.centerX()) + dAbs), Double.valueOf(((double) rectF.centerY()) + dAbs2));
    }

    public static final void i(RectF rectF, Number number, Number number2, Number number3, Number number4) {
        rectF.getClass();
        rectF.set(number.floatValue(), number2.floatValue(), number3.floatValue(), number4.floatValue());
    }

    public static String j(String str) {
        str.getClass();
        return "account:".concat(str);
    }

    public static final ChatConversation k(ChatConversationWithProjectReference chatConversationWithProjectReference) {
        chatConversationWithProjectReference.getClass();
        return new ChatConversation(chatConversationWithProjectReference.m209getUuidRjYBDck(), chatConversationWithProjectReference.getCreated_at(), chatConversationWithProjectReference.getUpdated_at(), chatConversationWithProjectReference.getName(), chatConversationWithProjectReference.getSummary(), chatConversationWithProjectReference.m207getModela6HIKFk(), chatConversationWithProjectReference.getSettings(), chatConversationWithProjectReference.is_starred(), chatConversationWithProjectReference.m208getProject_uuidvfJkQ(), chatConversationWithProjectReference.is_temporary(), chatConversationWithProjectReference.m206getCurrent_leaf_message_uuidsaiyK68(), null);
    }

    public static ChatConversationWithProjectReference l(ChatConversationWithNestedMessage chatConversationWithNestedMessage) {
        chatConversationWithNestedMessage.getClass();
        return new ChatConversationWithProjectReference(chatConversationWithNestedMessage.m198getUuidRjYBDck(), chatConversationWithNestedMessage.getCreated_at(), chatConversationWithNestedMessage.getUpdated_at(), chatConversationWithNestedMessage.getName(), chatConversationWithNestedMessage.getSummary(), chatConversationWithNestedMessage.m196getModela6HIKFk(), chatConversationWithNestedMessage.getSettings(), chatConversationWithNestedMessage.is_starred(), chatConversationWithNestedMessage.m197getProject_uuidvfJkQ(), null, chatConversationWithNestedMessage.is_temporary(), chatConversationWithNestedMessage.m195getCurrent_leaf_message_uuidsaiyK68(), null);
    }

    public static boolean m(int i, ssc sscVar, boolean z) throws ParserException {
        if (sscVar.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + sscVar.a());
        }
        if (sscVar.z() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (sscVar.z() == 118 && sscVar.z() == 111 && sscVar.z() == 114 && sscVar.z() == 98 && sscVar.z() == 105 && sscVar.z() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }

    public static final ChatConversationWithProjectReference n(ChatConversation chatConversation, ProjectReference projectReference) {
        chatConversation.getClass();
        return new ChatConversationWithProjectReference(chatConversation.m176getUuidRjYBDck(), chatConversation.getCreated_at(), chatConversation.getUpdated_at(), chatConversation.getName(), chatConversation.getSummary(), chatConversation.m174getModela6HIKFk(), chatConversation.getSettings(), chatConversation.is_starred(), chatConversation.m175getProject_uuidvfJkQ(), projectReference, chatConversation.is_temporary(), chatConversation.m173getCurrent_leaf_message_uuidsaiyK68(), null);
    }
}
