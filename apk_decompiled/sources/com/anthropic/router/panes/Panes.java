package com.anthropic.router.panes;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oob;
import defpackage.tqc;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.ye3;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 6*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\n\b\u0001\u0010\u0003 \u0001*\u00020\u0001*\n\b\u0002\u0010\u0004 \u0001*\u00020\u00012\u00020\u0001:\u000278B?\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0087\u0001\u0010\u001e\u001a\u00020\u001b\"\n\b\u0003\u0010\u0002*\u0004\u0018\u00010\u0001\"\n\b\u0004\u0010\u0003*\u0004\u0018\u00010\u0001\"\n\b\u0005\u0010\u0004*\u0004\u0018\u00010\u00012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00030\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00040\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00050\u0017H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\\\u0010%\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b2\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b3\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010$¨\u00069"}, d2 = {"Lcom/anthropic/router/panes/Panes;", "", "MainC", "DetailsC", "ExtraC", "", "main", "details", "extra", "Lye3;", "mode", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lye3;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lye3;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "typeSerial1", "typeSerial2", "Liei;", "write$Self$Claude_router", "(Lcom/anthropic/router/panes/Panes;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "()Lye3;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lye3;)Lcom/anthropic/router/panes/Panes;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMain", "getDetails", "getExtra", "Lye3;", "getMode", "Companion", "sqc", "tqc", "Claude:router"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class Panes<MainC, DetailsC, ExtraC> {
    private static final SerialDescriptor $cachedDescriptor;
    public static final int $stable = 0;
    private final List<DetailsC> details;
    private final List<ExtraC> extra;
    private final List<MainC> main;
    private final ye3 mode;
    public static final tqc Companion = new tqc();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new oob(23))};

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.router.panes.Panes", null, 4);
        pluginGeneratedSerialDescriptor.j("main", false);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("extra", true);
        pluginGeneratedSerialDescriptor.j("mode", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ Panes(int i, List list, List list2, List list3, ye3 ye3Var, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, $cachedDescriptor);
            throw null;
        }
        this.main = list;
        int i2 = i & 2;
        lm6 lm6Var = lm6.E;
        if (i2 == 0) {
            this.details = lm6Var;
        } else {
            this.details = list2;
        }
        if ((i & 4) == 0) {
            this.extra = lm6Var;
        } else {
            this.extra = list3;
        }
        if ((i & 8) == 0) {
            this.mode = ye3.E;
        } else {
            this.mode = ye3Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        ye3[] ye3VarArrValues = ye3.values();
        ye3VarArrValues.getClass();
        return new lq6("com.anthropic.router.panes.ChildPanesMode", (Enum[]) ye3VarArrValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Panes copy$default(Panes panes, List list, List list2, List list3, ye3 ye3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            list = panes.main;
        }
        if ((i & 2) != 0) {
            list2 = panes.details;
        }
        if ((i & 4) != 0) {
            list3 = panes.extra;
        }
        if ((i & 8) != 0) {
            ye3Var = panes.mode;
        }
        return panes.copy(list, list2, list3, ye3Var);
    }

    public static final /* synthetic */ void write$Self$Claude_router(Panes self, vd4 output, SerialDescriptor serialDesc, KSerializer typeSerial0, KSerializer typeSerial1, KSerializer typeSerial2) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, new uo0(typeSerial0, 0), self.main);
        boolean zE = output.E(serialDesc);
        lm6 lm6Var = lm6.E;
        if (zE || !x44.r(self.details, lm6Var)) {
            output.r(serialDesc, 1, new uo0(typeSerial1, 0), self.details);
        }
        if (output.E(serialDesc) || !x44.r(self.extra, lm6Var)) {
            output.r(serialDesc, 2, new uo0(typeSerial2, 0), self.extra);
        }
        if (!output.E(serialDesc) && self.mode == ye3.E) {
            return;
        }
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.mode);
    }

    public final List<MainC> component1() {
        return this.main;
    }

    public final List<DetailsC> component2() {
        return this.details;
    }

    public final List<ExtraC> component3() {
        return this.extra;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ye3 getMode() {
        return this.mode;
    }

    public final Panes<MainC, DetailsC, ExtraC> copy(List<? extends MainC> main, List<? extends DetailsC> details, List<? extends ExtraC> extra, ye3 mode) {
        main.getClass();
        details.getClass();
        extra.getClass();
        mode.getClass();
        return new Panes<>(main, details, extra, mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Panes)) {
            return false;
        }
        Panes panes = (Panes) other;
        return x44.r(this.main, panes.main) && x44.r(this.details, panes.details) && x44.r(this.extra, panes.extra) && this.mode == panes.mode;
    }

    public final List<DetailsC> getDetails() {
        return this.details;
    }

    public final List<ExtraC> getExtra() {
        return this.extra;
    }

    public final List<MainC> getMain() {
        return this.main;
    }

    public final ye3 getMode() {
        return this.mode;
    }

    public int hashCode() {
        return this.mode.hashCode() + kgh.m(kgh.m(this.main.hashCode() * 31, 31, this.details), 31, this.extra);
    }

    public String toString() {
        return "Panes(main=" + this.main + ", details=" + this.details + ", extra=" + this.extra + ", mode=" + this.mode + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Panes(List<? extends MainC> list, List<? extends DetailsC> list2, List<? extends ExtraC> list3, ye3 ye3Var) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        ye3Var.getClass();
        this.main = list;
        this.details = list2;
        this.extra = list3;
        this.mode = ye3Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Panes(List list, List list2, List list3, ye3 ye3Var, int i, mq5 mq5Var) {
        int i2 = i & 2;
        lm6 lm6Var = lm6.E;
        this(list, i2 != 0 ? lm6Var : list2, (i & 4) != 0 ? lm6Var : list3, (i & 8) != 0 ? ye3.E : ye3Var);
    }
}
