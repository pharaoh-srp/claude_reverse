package defpackage;

import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.models.organization.configtypes.WidgetToolConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class faj {
    public final rc8 a;
    public final wz5 b;
    public final wz5 c;
    public final wz5 d;
    public final wz5 e;

    public faj(rc8 rc8Var) {
        this.a = rc8Var;
        final int i = 0;
        this.b = mpk.w(new zy7(this) { // from class: eaj
            public final /* synthetic */ faj F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                List<Tool.KnownTool> completion;
                int i2 = i;
                Object obj = null;
                faj fajVar = this.F;
                switch (i2) {
                    case 0:
                        return (WidgetToolConfig) fajVar.a.g("mobile_enabled_widget_tools", WidgetToolConfig.Companion.serializer()).getValue();
                    case 1:
                        WidgetToolConfig widgetToolConfig = (WidgetToolConfig) fajVar.b.getValue();
                        return (widgetToolConfig == null || (completion = widgetToolConfig.getCompletion()) == null) ? lm6.E : completion;
                    case 2:
                        Iterator it = ((List) fajVar.c.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (x44.r(((Tool.KnownTool) next).getName(), hxh.f)) {
                                    obj = next;
                                }
                            }
                        }
                        return Boolean.valueOf(obj != null);
                    default:
                        Iterator it2 = ((List) fajVar.c.getValue()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (x44.r(((Tool.KnownTool) next2).getName(), hxh.l)) {
                                    obj = next2;
                                }
                            }
                        }
                        return Boolean.valueOf(obj != null);
                }
            }
        });
        final int i2 = 1;
        this.c = mpk.w(new zy7(this) { // from class: eaj
            public final /* synthetic */ faj F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                List<Tool.KnownTool> completion;
                int i22 = i2;
                Object obj = null;
                faj fajVar = this.F;
                switch (i22) {
                    case 0:
                        return (WidgetToolConfig) fajVar.a.g("mobile_enabled_widget_tools", WidgetToolConfig.Companion.serializer()).getValue();
                    case 1:
                        WidgetToolConfig widgetToolConfig = (WidgetToolConfig) fajVar.b.getValue();
                        return (widgetToolConfig == null || (completion = widgetToolConfig.getCompletion()) == null) ? lm6.E : completion;
                    case 2:
                        Iterator it = ((List) fajVar.c.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (x44.r(((Tool.KnownTool) next).getName(), hxh.f)) {
                                    obj = next;
                                }
                            }
                        }
                        return Boolean.valueOf(obj != null);
                    default:
                        Iterator it2 = ((List) fajVar.c.getValue()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (x44.r(((Tool.KnownTool) next2).getName(), hxh.l)) {
                                    obj = next2;
                                }
                            }
                        }
                        return Boolean.valueOf(obj != null);
                }
            }
        });
        final int i3 = 2;
        this.d = mpk.w(new zy7(this) { // from class: eaj
            public final /* synthetic */ faj F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                List<Tool.KnownTool> completion;
                int i22 = i3;
                Object obj = null;
                faj fajVar = this.F;
                switch (i22) {
                    case 0:
                        return (WidgetToolConfig) fajVar.a.g("mobile_enabled_widget_tools", WidgetToolConfig.Companion.serializer()).getValue();
                    case 1:
                        WidgetToolConfig widgetToolConfig = (WidgetToolConfig) fajVar.b.getValue();
                        return (widgetToolConfig == null || (completion = widgetToolConfig.getCompletion()) == null) ? lm6.E : completion;
                    case 2:
                        Iterator it = ((List) fajVar.c.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (x44.r(((Tool.KnownTool) next).getName(), hxh.f)) {
                                    obj = next;
                                }
                            }
                        }
                        return Boolean.valueOf(obj != null);
                    default:
                        Iterator it2 = ((List) fajVar.c.getValue()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (x44.r(((Tool.KnownTool) next2).getName(), hxh.l)) {
                                    obj = next2;
                                }
                            }
                        }
                        return Boolean.valueOf(obj != null);
                }
            }
        });
        final int i4 = 3;
        this.e = mpk.w(new zy7(this) { // from class: eaj
            public final /* synthetic */ faj F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                List<Tool.KnownTool> completion;
                int i22 = i4;
                Object obj = null;
                faj fajVar = this.F;
                switch (i22) {
                    case 0:
                        return (WidgetToolConfig) fajVar.a.g("mobile_enabled_widget_tools", WidgetToolConfig.Companion.serializer()).getValue();
                    case 1:
                        WidgetToolConfig widgetToolConfig = (WidgetToolConfig) fajVar.b.getValue();
                        return (widgetToolConfig == null || (completion = widgetToolConfig.getCompletion()) == null) ? lm6.E : completion;
                    case 2:
                        Iterator it = ((List) fajVar.c.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (x44.r(((Tool.KnownTool) next).getName(), hxh.f)) {
                                    obj = next;
                                }
                            }
                        }
                        return Boolean.valueOf(obj != null);
                    default:
                        Iterator it2 = ((List) fajVar.c.getValue()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (x44.r(((Tool.KnownTool) next2).getName(), hxh.l)) {
                                    obj = next2;
                                }
                            }
                        }
                        return Boolean.valueOf(obj != null);
                }
            }
        });
    }
}
