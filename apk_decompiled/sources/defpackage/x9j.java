package defpackage;

import com.anthropic.claude.analytics.events.WidgetEvents$OpenAppViaShortcut;
import com.anthropic.claude.analytics.events.WidgetEvents$ShortcutType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x9j implements w28 {
    public static final x9j a;
    private static final SerialDescriptor descriptor;

    static {
        x9j x9jVar = new x9j();
        a = x9jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("open_app_via_shortcut", x9jVar, 3);
        pluginGeneratedSerialDescriptor.j("shortcut_type", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", true);
        pluginGeneratedSerialDescriptor.j("artifact_identifier", true);
        pluginGeneratedSerialDescriptor.k(new xmb(22));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{WidgetEvents$OpenAppViaShortcut.$childSerializers[0].getValue(), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = WidgetEvents$OpenAppViaShortcut.$childSerializers;
        boolean z = true;
        int i = 0;
        WidgetEvents$ShortcutType widgetEvents$ShortcutType = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                widgetEvents$ShortcutType = (WidgetEvents$ShortcutType) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), widgetEvents$ShortcutType);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new WidgetEvents$OpenAppViaShortcut(i, widgetEvents$ShortcutType, str, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        WidgetEvents$OpenAppViaShortcut widgetEvents$OpenAppViaShortcut = (WidgetEvents$OpenAppViaShortcut) obj;
        encoder.getClass();
        widgetEvents$OpenAppViaShortcut.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        WidgetEvents$OpenAppViaShortcut.write$Self$analytics(widgetEvents$OpenAppViaShortcut, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
