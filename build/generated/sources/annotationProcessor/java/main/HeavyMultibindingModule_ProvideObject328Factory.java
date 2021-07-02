import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HeavyMultibindingModule_ProvideObject328Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject328Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject328(module);
  }

  public static HeavyMultibindingModule_ProvideObject328Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject328Factory(module);
  }

  public static Object provideObject328(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject328());
  }
}
