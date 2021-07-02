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
public final class HeavyMultibindingModule_ProvideObject896Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject896Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject896(module);
  }

  public static HeavyMultibindingModule_ProvideObject896Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject896Factory(module);
  }

  public static Object provideObject896(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject896());
  }
}
