package com.anthropic.claude.home;

import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pf6;
import defpackage.srg;
import defpackage.tf6;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zy7;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002,-B1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBE\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010\u001d\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, d2 = {"com/anthropic/claude/home/DrawerTabPreferences$Persisted", "", "", "", "visible", "hidden", "launchTab", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/home/DrawerTabPreferences$Persisted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$home", "(Lcom/anthropic/claude/home/DrawerTabPreferences$Persisted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/home/DrawerTabPreferences$Persisted;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getVisible", "getHidden", "Ljava/lang/String;", "getLaunchTab", "Companion", "com/anthropic/claude/home/b", "tf6", "home"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
final /* data */ class DrawerTabPreferences$Persisted {
    private static final kw9[] $childSerializers;
    public static final tf6 Companion = new tf6();
    private final List<String> hidden;
    private final String launchTab;
    private final List<String> visible;

    static {
        final int i = 0;
        zy7 zy7Var = new zy7() { // from class: com.anthropic.claude.home.a
            @Override // defpackage.zy7
            public final Object a() {
                switch (i) {
                    case 0:
                        return DrawerTabPreferences$Persisted._childSerializers$_anonymous_();
                    default:
                        return DrawerTabPreferences$Persisted._childSerializers$_anonymous_$0();
                }
            }
        };
        w1a w1aVar = w1a.F;
        final int i2 = 1;
        $childSerializers = new kw9[]{yb5.w(w1aVar, zy7Var), yb5.w(w1aVar, new zy7() { // from class: com.anthropic.claude.home.a
            @Override // defpackage.zy7
            public final Object a() {
                switch (i2) {
                    case 0:
                        return DrawerTabPreferences$Persisted._childSerializers$_anonymous_();
                    default:
                        return DrawerTabPreferences$Persisted._childSerializers$_anonymous_$0();
                }
            }
        }), null};
    }

    public DrawerTabPreferences$Persisted(int i, List list, List list2, String str, vnf vnfVar) {
        int i2 = i & 1;
        lm6 lm6Var = lm6.E;
        if (i2 == 0) {
            this.visible = lm6Var;
        } else {
            this.visible = list;
        }
        if ((i & 2) == 0) {
            this.hidden = lm6Var;
        } else {
            this.hidden = list2;
        }
        if ((i & 4) == 0) {
            this.launchTab = pf6.I.E;
        } else {
            this.launchTab = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawerTabPreferences$Persisted copy$default(DrawerTabPreferences$Persisted drawerTabPreferences$Persisted, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = drawerTabPreferences$Persisted.visible;
        }
        if ((i & 2) != 0) {
            list2 = drawerTabPreferences$Persisted.hidden;
        }
        if ((i & 4) != 0) {
            str = drawerTabPreferences$Persisted.launchTab;
        }
        return drawerTabPreferences$Persisted.copy(list, list2, str);
    }

    public static final void write$Self$home(DrawerTabPreferences$Persisted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        boolean zE = output.E(serialDesc);
        lm6 lm6Var = lm6.E;
        if (zE || !x44.r(self.visible, lm6Var)) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.visible);
        }
        if (output.E(serialDesc) || !x44.r(self.hidden, lm6Var)) {
            output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.hidden);
        }
        if (!output.E(serialDesc) && x44.r(self.launchTab, pf6.I.E)) {
            return;
        }
        output.q(serialDesc, 2, self.launchTab);
    }

    public final List<String> component1() {
        return this.visible;
    }

    public final List<String> component2() {
        return this.hidden;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLaunchTab() {
        return this.launchTab;
    }

    public final DrawerTabPreferences$Persisted copy(List<String> visible, List<String> hidden, String launchTab) {
        visible.getClass();
        hidden.getClass();
        launchTab.getClass();
        return new DrawerTabPreferences$Persisted(visible, hidden, launchTab);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawerTabPreferences$Persisted)) {
            return false;
        }
        DrawerTabPreferences$Persisted drawerTabPreferences$Persisted = (DrawerTabPreferences$Persisted) other;
        return x44.r(this.visible, drawerTabPreferences$Persisted.visible) && x44.r(this.hidden, drawerTabPreferences$Persisted.hidden) && x44.r(this.launchTab, drawerTabPreferences$Persisted.launchTab);
    }

    public final List<String> getHidden() {
        return this.hidden;
    }

    public final String getLaunchTab() {
        return this.launchTab;
    }

    public final List<String> getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return this.launchTab.hashCode() + kgh.m(this.visible.hashCode() * 31, 31, this.hidden);
    }

    public String toString() {
        List<String> list = this.visible;
        List<String> list2 = this.hidden;
        String str = this.launchTab;
        StringBuilder sb = new StringBuilder("Persisted(visible=");
        sb.append(list);
        sb.append(", hidden=");
        sb.append(list2);
        sb.append(", launchTab=");
        return ij0.m(sb, str, ")");
    }

    public DrawerTabPreferences$Persisted() {
        this((List) null, (List) null, (String) null, 7, (mq5) null);
    }

    public DrawerTabPreferences$Persisted(List<String> list, List<String> list2, String str) {
        list.getClass();
        list2.getClass();
        str.getClass();
        this.visible = list;
        this.hidden = list2;
        this.launchTab = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DrawerTabPreferences$Persisted(List list, List list2, String str, int i, mq5 mq5Var) {
        int i2 = i & 1;
        lm6 lm6Var = lm6.E;
        this(i2 != 0 ? lm6Var : list, (i & 2) != 0 ? lm6Var : list2, (i & 4) != 0 ? pf6.I.E : str);
    }
}
