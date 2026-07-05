package defpackage;

import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.types.strings.ToolUseId;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gw8 {
    public final fj0 a = new fj0(wl0.H, new sz6(21));
    public final lsc b = mpk.P(null);
    public final lsc c = mpk.P(null);
    public final lsc d;
    public final lsc e;
    public int f;

    public gw8() {
        Boolean bool = Boolean.FALSE;
        this.d = mpk.P(bool);
        this.e = mpk.P(bool);
    }

    public final boolean a(String str) {
        str.getClass();
        ToolUseId toolUseId = (ToolUseId) this.c.getValue();
        String strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
        return (strM1163unboximpl == null ? false : ToolUseId.m1160equalsimpl0(strM1163unboximpl, str)) && (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.e.getValue()).booleanValue());
    }

    public final String b(String str) {
        ImageGalleryItemId imageGalleryItemId;
        str.getClass();
        ToolUseId toolUseId = (ToolUseId) this.c.getValue();
        String strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
        if (!(strM1163unboximpl == null ? false : ToolUseId.m1160equalsimpl0(strM1163unboximpl, str)) || (imageGalleryItemId = (ImageGalleryItemId) this.b.getValue()) == null) {
            return null;
        }
        return imageGalleryItemId.m310unboximpl();
    }

    public final void c(String str, String str2, List list) {
        list.getClass();
        str.getClass();
        fj0 fj0Var = this.a;
        fj0Var.getClass();
        fj0Var.F(list, new lc4(12));
        this.c.setValue(ToolUseId.m1157boximpl(str));
        this.b.setValue(ImageGalleryItemId.m304boximpl(str2));
        this.d.setValue(Boolean.FALSE);
        d(false);
        this.f++;
    }

    public final void d(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }
}
