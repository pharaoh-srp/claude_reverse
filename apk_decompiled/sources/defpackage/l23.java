package defpackage;

import android.content.Context;
import android.util.Base64;
import com.anthropic.claude.mcpapps.transport.McpUiContentBlock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class l23 extends xzg implements pz7 {
    public final /* synthetic */ McpUiContentBlock.Image E;
    public final /* synthetic */ Context F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l23(McpUiContentBlock.Image image, Context context, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = image;
        this.F = context;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new l23(this.E, this.F, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((l23) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws IOException {
        sf5.h0(obj);
        McpUiContentBlock.Image image = this.E;
        byte[] bArrDecode = Base64.decode(image.getData(), 0);
        String str = "png";
        if (!bsg.u0(image.getMimeType(), "png", false)) {
            str = "gif";
            if (!bsg.u0(image.getMimeType(), "gif", false)) {
                str = "webp";
                if (!bsg.u0(image.getMimeType(), "webp", false)) {
                    str = "jpg";
                }
            }
        }
        File file = new File(this.F.getCacheDir(), "tmp");
        file.mkdirs();
        File fileCreateTempFile = File.createTempFile("mcp_app_image_", ".".concat(str), file);
        fileCreateTempFile.getClass();
        bArrDecode.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            fileOutputStream.write(bArrDecode);
            fileOutputStream.close();
            return fileCreateTempFile;
        } finally {
        }
    }
}
