package defpackage;

import android.net.Uri;
import com.anthropic.claude.analytics.events.ChatEvents$AddAttachment;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.analytics.events.ChatEvents$UploadSource;
import com.anthropic.claude.analytics.events.ScreenSource;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface yw2 {
    public static final xw2 a = xw2.a;

    Object a(Uri uri, String str, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, pz7 pz7Var, String str2, zy7 zy7Var, vp4 vp4Var);

    void b();

    boolean c();

    void d(List list, List list2);

    boolean e();

    void f(String str, ww2 ww2Var);

    Object g(String str, sw2 sw2Var, tw2 tw2Var, ChatEvents$UploadSource chatEvents$UploadSource, pz7 pz7Var, xzg xzgVar);

    List getFiles();

    void h();

    default void i(ChatEvents$AddAttachment chatEvents$AddAttachment, boolean z, String str) {
    }

    boolean k(String str);
}
