package defpackage;

import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.models.organization.configtypes.SupportedToolsConfig;
import com.anthropic.claude.tool.model.Tool;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jzg {
    public final rc8 a;
    public final List b = x44.W(Tool.WebSearch.INSTANCE.toApiModel());
    public final wz5 c;
    public final wz5 d;

    public jzg(rc8 rc8Var) {
        this.a = rc8Var;
        final int i = 0;
        this.c = mpk.w(new zy7(this) { // from class: izg
            public final /* synthetic */ jzg F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                jzg jzgVar = this.F;
                switch (i2) {
                    case 0:
                        SupportedToolsConfig supportedToolsConfig = (SupportedToolsConfig) jzgVar.a.g("mobile_supported_tools", SupportedToolsConfig.Companion.serializer()).getValue();
                        if (supportedToolsConfig != null) {
                            return supportedToolsConfig;
                        }
                        SilentException.a(new SilentException("Failed to load supported tools config"), null, false, 3);
                        List list = jzgVar.b;
                        return new SupportedToolsConfig(list, list);
                    default:
                        return ((SupportedToolsConfig) jzgVar.c.getValue()).getCompletion();
                }
            }
        });
        final int i2 = 1;
        this.d = mpk.w(new zy7(this) { // from class: izg
            public final /* synthetic */ jzg F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                jzg jzgVar = this.F;
                switch (i22) {
                    case 0:
                        SupportedToolsConfig supportedToolsConfig = (SupportedToolsConfig) jzgVar.a.g("mobile_supported_tools", SupportedToolsConfig.Companion.serializer()).getValue();
                        if (supportedToolsConfig != null) {
                            return supportedToolsConfig;
                        }
                        SilentException.a(new SilentException("Failed to load supported tools config"), null, false, 3);
                        List list = jzgVar.b;
                        return new SupportedToolsConfig(list, list);
                    default:
                        return ((SupportedToolsConfig) jzgVar.c.getValue()).getCompletion();
                }
            }
        });
    }
}
