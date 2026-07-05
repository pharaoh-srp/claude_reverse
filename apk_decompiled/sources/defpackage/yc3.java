package defpackage;

import android.webkit.MimeTypeMap;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.artifact.model.WiggleArtifactIdentifier;
import com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams;
import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yc3 {
    /* JADX WARN: Removed duplicated region for block: B:4:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(java.lang.String r5, boolean r6) {
        /*
            r5.getClass()
            java.util.Set r0 = defpackage.ikb.a
            java.lang.String r0 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r5)
            r0.getClass()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r2 = "pdf"
            boolean r2 = r0.equals(r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L21
        L1f:
            r6 = r4
            goto L75
        L21:
            java.lang.String r2 = "md"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r2 = "markdown"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L32
            goto L74
        L32:
            java.lang.String r2 = "html"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r2 = "htm"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r2 = "tsx"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r2 = "jsx"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r2 = "svg"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r2 = "mermaid"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r2 = "mmd"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L6b
            goto L74
        L6b:
            java.util.Set r2 = defpackage.ikb.b
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L1f
            goto L75
        L74:
            r6 = r3
        L75:
            if (r6 != 0) goto L8f
            java.lang.String r5 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r5)
            r5.getClass()
            java.lang.String r5 = r5.toLowerCase(r1)
            r5.getClass()
            java.util.Set r6 = defpackage.ikb.a
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L8e
            goto L8f
        L8e:
            return r4
        L8f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc3.a(java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean c(String str, t53 t53Var, rwe rweVar, rwe rweVar2) {
        str.getClass();
        t53Var.getClass();
        rweVar.getClass();
        gmf gmfVar = rweVar.E;
        rweVar2.getClass();
        String str2 = t53Var.d.e;
        String str3 = t53Var.L0;
        str2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder("/api/organizations/");
        sb.append(str2);
        sb.append("/conversations/");
        String strQ = kgh.q(sb, str3, "/wiggle/download-file?path=", str);
        String strE1 = bsg.e1(str, "/", str);
        int i = 1;
        Object[] objArr = 0;
        if (a(str, ((Boolean) t53Var.Q1.getValue()).booleanValue())) {
            ArtifactBottomSheetParams.WiggleFileArtifact wiggleFileArtifact = new ArtifactBottomSheetParams.WiggleFileArtifact(new WiggleArtifactIdentifier(str3, str, objArr == true ? 1 : 0), !t53Var.a1());
            gb9.D(t53Var.a, null, null, new m43(t53Var, wiggleFileArtifact, null), 3);
            rweVar2.E.m(new t23(new ChatScreenArtifactSheetDestination.ViewArtifact(wiggleFileArtifact), 2), new j83(12));
            return true;
        }
        Set set = ikb.a;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        if (!x44.r(mimeTypeFromExtension != null ? (String) w44.L0(bsg.Y0(mimeTypeFromExtension, new String[]{"/"}, 6)) : null, "image")) {
            if (!x44.r(MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str)), "application/pdf")) {
                return false;
            }
            gmfVar.m(new cv(17, new ChatScreenModalBottomSheetDestination.PreviewPdf(strQ, strE1, true, false)), new j83(14));
            return true;
        }
        uhd uhdVar = (uhd) t53Var.g1.getValue();
        gmfVar.m(new q23(new ChatScreenModalBottomSheetDestination.PreviewImage(new MessageImageAsset(strQ, null, null, uhdVar != null ? uhdVar.a : null, 6, null), true, false, true, 4, (mq5) null), i), new j83(13));
        return true;
    }
}
