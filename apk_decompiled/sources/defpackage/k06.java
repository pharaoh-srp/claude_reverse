package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k06 implements i06 {
    public static final /* synthetic */ wn9[] W;
    public final va1 A;
    public final va1 B;
    public final va1 C;
    public final va1 D;
    public final va1 E;
    public final va1 F;
    public final va1 G;
    public final va1 H;
    public final va1 I;
    public final va1 J;
    public final va1 K;
    public final va1 L;
    public final va1 M;
    public final va1 N;
    public final va1 O;
    public final va1 P;
    public final va1 Q;
    public final va1 R;
    public final va1 S;
    public final va1 T;
    public final va1 U;
    public final va1 V;
    public boolean a;
    public final va1 b = new va1(zh3.d, 2, this);
    public final va1 c;
    public final va1 d;
    public final va1 e;
    public final va1 f;
    public final va1 g;
    public final va1 h;
    public final va1 i;
    public final va1 j;
    public final va1 k;
    public final va1 l;
    public final va1 m;
    public final va1 n;
    public final va1 o;
    public final va1 p;
    public final va1 q;
    public final va1 r;
    public final va1 s;
    public final va1 t;
    public final va1 u;
    public final va1 v;
    public final va1 w;
    public final va1 x;
    public final va1 y;
    public final va1 z;

    static {
        kce kceVar = jce.a;
        W = new wn9[]{kceVar.e(new bwb(kceVar.b(k06.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), kceVar.e(new bwb(kceVar.b(k06.class), "withDefinedIn", "getWithDefinedIn()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "modifiers", "getModifiers()Ljava/util/Set;")), kceVar.e(new bwb(kceVar.b(k06.class), "startFromName", "getStartFromName()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "debugMode", "getDebugMode()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "verbose", "getVerbose()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "unitReturnType", "getUnitReturnType()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "withoutReturnType", "getWithoutReturnType()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "enhancedTypes", "getEnhancedTypes()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "renderDefaultModality", "getRenderDefaultModality()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), kceVar.e(new bwb(kceVar.b(k06.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), kceVar.e(new bwb(kceVar.b(k06.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), kceVar.e(new bwb(kceVar.b(k06.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), kceVar.e(new bwb(kceVar.b(k06.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), kceVar.e(new bwb(kceVar.b(k06.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), kceVar.e(new bwb(kceVar.b(k06.class), "receiverAfterName", "getReceiverAfterName()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), kceVar.e(new bwb(kceVar.b(k06.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), kceVar.e(new bwb(kceVar.b(k06.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), kceVar.e(new bwb(kceVar.b(k06.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), kceVar.e(new bwb(kceVar.b(k06.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), kceVar.e(new bwb(kceVar.b(k06.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), kceVar.e(new bwb(kceVar.b(k06.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public k06() {
        Boolean bool = Boolean.TRUE;
        this.c = new va1(bool, 2, this);
        this.d = new va1(bool, 2, this);
        this.e = new va1(h06.F, 2, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new va1(bool2, 2, this);
        this.g = new va1(bool2, 2, this);
        this.h = new va1(bool2, 2, this);
        this.i = new va1(bool2, 2, this);
        this.j = new va1(bool2, 2, this);
        this.k = new va1(bool, 2, this);
        this.l = new va1(bool2, 2, this);
        this.m = new va1(bool2, 2, this);
        this.n = new va1(bool2, 2, this);
        this.o = new va1(bool, 2, this);
        this.p = new va1(bool, 2, this);
        this.q = new va1(bool2, 2, this);
        this.r = new va1(bool2, 2, this);
        this.s = new va1(bool2, 2, this);
        this.t = new va1(bool2, 2, this);
        this.u = new va1(bool2, 2, this);
        this.v = new va1(bool2, 2, this);
        this.w = new va1(bool2, 2, this);
        this.x = new va1(j06.H, 2, this);
        this.y = new va1(j06.G, 2, this);
        this.z = new va1(bool, 2, this);
        this.A = new va1(emc.F, 2, this);
        this.B = new va1(d06.a, 2, this);
        this.C = new va1(kge.E, 2, this);
        this.D = new va1(xrc.E, 2, this);
        this.E = new va1(bool2, 2, this);
        this.F = new va1(bool2, 2, this);
        this.G = new va1(frd.E, 2, this);
        this.H = new va1(bool2, 2, this);
        this.I = new va1(bool2, 2, this);
        this.J = new va1(um6.E, 2, this);
        this.K = new va1(d57.a, 2, this);
        this.L = new va1(null, 2, this);
        this.M = new va1(ec0.NO_ARGUMENTS, 2, this);
        this.N = new va1(bool2, 2, this);
        this.O = new va1(bool, 2, this);
        this.P = new va1(bool, 2, this);
        this.Q = new va1(bool2, 2, this);
        this.R = new va1(bool, 2, this);
        this.S = new va1(bool, 2, this);
        this.T = new va1(bool2, 2, this);
        this.U = new va1(bool2, 2, this);
        this.V = new va1(bool, 2, this);
    }

    @Override // defpackage.i06
    public final void a() {
        this.E.a(this, W[29], Boolean.TRUE);
    }

    @Override // defpackage.i06
    public final void b() {
        this.h.a(this, W[6], Boolean.TRUE);
    }

    @Override // defpackage.i06
    public final void c() {
        this.F.a(this, W[30], Boolean.TRUE);
    }

    @Override // defpackage.i06
    public final void d(Set set) {
        set.getClass();
        this.e.a(this, W[3], set);
    }

    @Override // defpackage.i06
    public final void e(LinkedHashSet linkedHashSet) {
        this.K.a(this, W[35], linkedHashSet);
    }

    @Override // defpackage.i06
    public final void f() {
        this.v.a(this, W[20], Boolean.TRUE);
    }

    @Override // defpackage.i06
    public final void g(xrc xrcVar) {
        this.D.a(this, W[28], xrcVar);
    }

    @Override // defpackage.i06
    public final void h(zh3 zh3Var) {
        this.b.a(this, W[0], zh3Var);
    }

    @Override // defpackage.i06
    public final void i() {
        this.f.a(this, W[4], Boolean.TRUE);
    }

    @Override // defpackage.i06
    public final void j() {
        this.c.a(this, W[1], Boolean.FALSE);
    }

    @Override // defpackage.i06
    public final Set k() {
        wn9 wn9Var = W[35];
        va1 va1Var = this.K;
        va1Var.getClass();
        wn9Var.getClass();
        return (Set) va1Var.a;
    }

    @Override // defpackage.i06
    public final ec0 l() {
        wn9 wn9Var = W[37];
        va1 va1Var = this.M;
        va1Var.getClass();
        wn9Var.getClass();
        return (ec0) va1Var.a;
    }

    @Override // defpackage.i06
    public final void m() {
        this.C.a(this, W[27], kge.F);
    }

    @Override // defpackage.i06
    public final void n() {
        this.w.a(this, W[21], Boolean.TRUE);
    }

    public final boolean o() {
        wn9 wn9Var = W[6];
        va1 va1Var = this.h;
        va1Var.getClass();
        wn9Var.getClass();
        return ((Boolean) va1Var.a).booleanValue();
    }
}
