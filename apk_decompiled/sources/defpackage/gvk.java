package defpackage;

import android.os.Bundle;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.ConversationSearchHit;
import com.anthropic.claude.api.chat.MatchSpan;
import com.anthropic.claude.api.chat.MatchedSnippet;
import com.pvporbit.freetype.FreeTypeConstants;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gvk {
    public static final ta4 a = new ta4(17047608, false, new cc4(17));

    public static final void a(q21 q21Var, mnc mncVar, iqb iqbVar, oxf oxfVar, ld4 ld4Var, int i) {
        e18 e18Var;
        mncVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1920938727);
        int i2 = i | (e18Var2.f(q21Var) ? 4 : 2) | (e18Var2.f(mncVar) ? 32 : 16) | (e18Var2.f(oxfVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var = e18Var2;
            b(q21Var.a, q21Var.b, q21Var.c, iqbVar, q21Var.e, q21Var.d, q21Var.f, q21Var.g, q21Var.h, q21Var.i, oxfVar, null, mncVar, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 3080, ((i2 >> 9) & 14) | ((i2 << 3) & 896), 26624);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn(q21Var, mncVar, iqbVar, oxfVar, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    /* JADX WARN: Type inference failed for: r15v1, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [e18] */
    /* JADX WARN: Type inference failed for: r20v8, types: [ld4] */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r45v1, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.bpc r41, final java.lang.String r42, final defpackage.zy7 r43, defpackage.iqb r44, java.lang.String r45, defpackage.pz7 r46, boolean r47, boolean r48, boolean r49, defpackage.zy7 r50, defpackage.oxf r51, defpackage.nxf r52, final defpackage.mnc r53, defpackage.mnc r54, float r55, defpackage.ld4 r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instruction units count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvk.b(bpc, java.lang.String, zy7, iqb, java.lang.String, pz7, boolean, boolean, boolean, zy7, oxf, nxf, mnc, mnc, float, ld4, int, int, int):void");
    }

    public static final long c(t7d t7dVar, boolean z) {
        List list = t7dVar.a;
        int size = list.size();
        long jI = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            z7d z7dVar = (z7d) list.get(i2);
            if (z7dVar.d && z7dVar.h) {
                jI = fcc.i(jI, z ? z7dVar.c : z7dVar.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return fcc.b(i, jI);
    }

    public static final float d(t7d t7dVar, boolean z) {
        long jC = c(t7dVar, z);
        boolean zC = fcc.c(jC, 9205357640488583168L);
        float fD = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (zC) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        List list = t7dVar.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            z7d z7dVar = (z7d) list.get(i2);
            if (z7dVar.d && z7dVar.h) {
                i++;
                fD = fcc.d(fcc.h(z ? z7dVar.c : z7dVar.g, jC)) + fD;
            }
        }
        return fD / i;
    }

    public static final long e(t7d t7dVar) {
        long jC = c(t7dVar, true);
        if (fcc.c(jC, 9205357640488583168L)) {
            return 0L;
        }
        return fcc.h(jC, c(t7dVar, false));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static k5 f(String str, Bundle bundle) throws NoCredentialException {
        str.getClass();
        bundle.getClass();
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            Object obj = bundle.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            obj.getClass();
                            return obj instanceof byte[] ? new wd5(new String((byte[]) obj, dj2.a), bundle, 1) : new wd5((String) obj, bundle, 1);
                        } catch (Exception unused) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string == null) {
                            throw new NoCredentialException("The device does not contain a restore credential.");
                        }
                        wd5 wd5Var = new wd5("androidx.credentials.TYPE_RESTORE_CREDENTIAL", bundle);
                        if (string.length() != 0) {
                            try {
                                new JSONObject(string);
                                return wd5Var;
                            } catch (Exception unused2) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new FrameworkClassParsingException();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            string2.getClass();
                            string3.getClass();
                            return new wd5(string3, bundle, 2);
                        } catch (Exception unused3) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string4 = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            string4.getClass();
                            return new wd5(string4, bundle, 3);
                        } catch (Exception unused4) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                default:
                    throw new FrameworkClassParsingException();
            }
        } catch (FrameworkClassParsingException unused5) {
            return new wd5(str, bundle, 0);
        }
    }

    public static ArrayList g(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b = byteBufferAsReadOnlyBuffer.get();
                int i = (b >> 3) & 15;
                if (((b >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b2 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b2 & 127) << (i2 * 7);
                        if ((b2 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList.add(new pbc(byteBufferDuplicate, i));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static final qdf h(ConversationSearchHit conversationSearchHit) {
        pdf pdfVar;
        MatchedSnippet matched_snippet = conversationSearchHit.getMatched_snippet();
        if (matched_snippet != null) {
            String text = matched_snippet.getText();
            List<MatchSpan> matches = matched_snippet.getMatches();
            ArrayList arrayList = new ArrayList(x44.y(matches, 10));
            for (MatchSpan matchSpan : matches) {
                arrayList.add(wd6.H0(matchSpan.getStart(), Math.max(matchSpan.getStart(), matchSpan.getEnd())));
            }
            pdfVar = new pdf(text, arrayList);
        } else {
            pdfVar = null;
        }
        String name = conversationSearchHit.getConversation().getName();
        List<MatchSpan> title_matches = conversationSearchHit.getTitle_matches();
        ArrayList arrayList2 = new ArrayList(x44.y(title_matches, 10));
        for (MatchSpan matchSpan2 : title_matches) {
            arrayList2.add(wd6.H0(matchSpan2.getStart(), Math.max(matchSpan2.getStart(), matchSpan2.getEnd())));
        }
        return new qdf(pdfVar, name, arrayList2);
    }
}
