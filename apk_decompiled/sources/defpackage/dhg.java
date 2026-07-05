package defpackage;

import com.anthropic.claude.bell.api.VoiceSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dhg {
    public static final ArrayList d;
    public final String a;
    public final String b;
    public final String c;

    static {
        String str;
        VoiceSelection.Companion.getClass();
        List list = VoiceSelection.BUNDLED;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strM579unboximpl = ((VoiceSelection) it.next()).m579unboximpl();
            if (strM579unboximpl.length() > 0) {
                str = ((Object) unk.j(strM579unboximpl.charAt(0))) + strM579unboximpl.substring(1);
            } else {
                str = strM579unboximpl;
            }
            arrayList.add(new dhg(strM579unboximpl, str, null));
        }
        d = arrayList;
    }

    public dhg(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhg)) {
            return false;
        }
        dhg dhgVar = (dhg) obj;
        return VoiceSelection.m576equalsimpl0(this.a, dhgVar.a) && x44.r(this.b, dhgVar.b) && x44.r(this.c, dhgVar.c);
    }

    public final int hashCode() {
        int iL = kgh.l(VoiceSelection.m577hashCodeimpl(this.a) * 31, 31, this.b);
        String str = this.c;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.m(kgh.r("SpeechInputVoice(id=", VoiceSelection.m578toStringimpl(this.a), ", displayName=", this.b, ", previewUrl="), this.c, ")");
    }
}
